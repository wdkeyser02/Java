public class Thread_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        System.out.println("Main Thread isVirtual: " + Thread.currentThread().isVirtual());
        Thread.Builder myBuilder = Thread.ofVirtual().name("My Thread");
        Runnable runnable = () -> {
            System.out.println("Hello from MyThread!");
            System.out.println("Thread name: " + Thread.currentThread().getName());
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
            System.out.println("Thread state: " + Thread.currentThread().getState());
            System.out.println("Thread ThreadGroup: " + Thread.currentThread().getThreadGroup());
            System.out.println("Thread Alive: " + Thread.currentThread().isAlive());
            System.out.println("Thread Daemon: " + Thread.currentThread().isDaemon());
            System.out.println("Thread Interrupted: " + Thread.currentThread().isInterrupted());
            System.out.println("Thread Virtual: " + Thread.currentThread().isVirtual());
        };
        Thread thread = myBuilder.start(runnable);
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
