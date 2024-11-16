public class Thread_8 {

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " running");
            System.out.println("MyThread finished");
        }

    }

    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        Thread myThread = new Thread(new MyRunnable(), "MyRummable Thread");
        myThread.start();
    }
}
