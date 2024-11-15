import java.util.concurrent.atomic.AtomicInteger;

public class Thread_2 {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private static Thread threadIncrement;
    private static Thread threadDecrement;

    public static void main(String[] args) {
        System.out.println("\nMain is Started!\n");
        threadIncrement = new Thread(new WorkerIncrement());
        threadDecrement = new Thread(new WorkerDecrement());
        threadIncrement.start();
        threadDecrement.start();
        
    }

    static class WorkerIncrement implements Runnable {
        public void run() {
            while (counter.get() < 10) {
                try {
                    counter.incrementAndGet();
                    System.out.println("Counter Increment: " + counter);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Worker Increment stopped!");
                    return;
                }
            }
            System.out.println("Worker Increment done!");
            threadDecrement.interrupt();
        }
    }

    static class WorkerDecrement implements Runnable {
        public void run() {
            while (counter.get() >= 0) {
                try {
                    counter.decrementAndGet();
                    System.out.println("Counter Decrement: " + counter);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Worker Decrement Stopped!");
                    return; 
                }
            }
            System.out.println("Worker Decrement done!");
            threadIncrement.interrupt();   
        }
    }
}
