public class Thread_5 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        Runnable myRunnable = () -> {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        };
        
        Thread.Builder myBuilder = Thread.ofPlatform().name("MyThread");
        Thread myThread = myBuilder.start(myRunnable);
        System.out.println("Thread: " + myThread.getName() + " - " + myThread.threadId());
    }
}
