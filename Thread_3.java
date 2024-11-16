public class Thread_3 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        Runnable myRunnable = () -> {
            for(int i=0; i<10; i++) {
                System.out.println(Thread.currentThread().threadId() + " Index: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread myThread1 = Thread.startVirtualThread(myRunnable);
        
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Class stopped!");
    }
}
