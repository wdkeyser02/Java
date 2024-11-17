import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class UseCaseTaskScheduler {
    private final PriorityQueue<UseCaseTask> tasks;
    private final Thread[] threads;
    private final AtomicBoolean running;
    private final Lock lock;
    private final Condition newTaskAdded;

    public UseCaseTaskScheduler(int numThreads) {
        this.tasks = new PriorityQueue<>();
        this.threads = new Thread[numThreads];
        this.running = new AtomicBoolean(true);
        this.lock = new ReentrantLock();
        this.newTaskAdded = lock.newCondition();
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new TaskExecutor());
            threads[i].start();
        }
    }

    public void schedule(Runnable task, long time) {
        lock.lock();
        try {
            UseCaseTask newTask = new UseCaseTask(task, time, 0);
            tasks.add(newTask);
            newTaskAdded.signal();
        } finally {
            lock.unlock();
        }
    }

    public void scheduleAtFixedInterval(Runnable task,long interval) {
        lock.lock();
        try {
            UseCaseTask newTask = new UseCaseTask(task, System.currentTimeMillis() + interval, interval);
            tasks.add(newTask);
            newTaskAdded.signal();
        } finally {
            lock.unlock();
        }
    }

    public void shutdown() {
        running.set(false);
        lock.lock();
        try {
            newTaskAdded.signalAll();
        } finally {
            lock.unlock();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class TaskExecutor implements Runnable {

        @Override
        public void run() {
            while (running.get()) {
                lock.lock();
                try {
                    while (tasks.isEmpty()) {
                        newTaskAdded.await();
                    }

                    UseCaseTask task = tasks.peek();
                    long currentTime = System.currentTimeMillis();
                    long delay = Math.max(task.getExecutionTime() - currentTime, 0);

                    if (delay > 0) {
                        try {
                            newTaskAdded.await(delay, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            if (!running.get()) {
                                return;
                            }
                        }
                    } else {
                        tasks.poll();
                        task.getTask().run();
                        if (task.getInterval() > 0 && running.get()) {
                            task = new UseCaseTask(task.getTask(), currentTime + task.getInterval(), task.getInterval());
                            tasks.add(task);
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
