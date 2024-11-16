public class Thread_3 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        Runnable myRunnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("MyThread running");
                System.out.println("MyThread finished");
            } 
        };
        Thread myThread = new Thread(myRunnable);
        myThread.start();
        System.out.println("Thread: " + myThread.getName() + " - " + myThread.threadId());
    }
}
