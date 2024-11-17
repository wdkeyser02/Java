public class Thread_13 {
    public static void main(String[] args) {
        
        // Thread Priority and Group
        
        System.out.println("\nJAVA Threads\n");
        Thread thread1 = new Thread(() -> {
            
            System.out.println("Thread 1");
        });
        
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2");
        });
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        ThreadGroup group = new ThreadGroup("MyThreadGroup");
        Thread thread3 = new Thread(group, () -> {
            System.out.println("Thread 3");
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
