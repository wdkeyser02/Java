public class Thread_9 {

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        Thread myThread1 = new Thread(new MyRunnable(), "MyRummable Thread 1");
        myThread1.start();
        Thread myThread2 = new Thread(new MyRunnable(), "MyRummable Thread 2");
        myThread2.start();
    }
}
