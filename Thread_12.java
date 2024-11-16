public class Thread_12 {
    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        Runnable myRunnable = () -> {
            for(int i = 0; i<5; i++) {
                sleep(1000);
                System.out.println("Thread is running!");
                
            }
        };
        Thread myThread = new Thread(myRunnable);
        myThread.setDaemon(true);
        myThread.start(); 
        //try {
        //    myThread.join();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        System.out.println("Main class is stopped!");
    }

    private static void sleep(long millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
