public class Thread_2 {

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }

    }
    
    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        Thread myThread = new Thread(new MyRunnable(), "MyThread");
        myThread.start();
        System.out.println("Thread: " + myThread.getName() + " - " + myThread.threadId());
    }
}
