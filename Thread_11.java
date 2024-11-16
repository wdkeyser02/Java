public class Thread_11 {
    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        Runnable myRunnable = () -> {
            while (true) {
                sleep(1000);
                System.out.println("Thread is running!");
                
            }
        };
        Thread myThread = new Thread(myRunnable);
        //myThread.setDaemon(true);
        myThread.start();
        sleep(5100);
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
