public class Thread_10 {

    public static class MyRunnable implements Runnable {

        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep(long millisecond) {
            try {
                Thread.sleep(millisecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " running");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println(".......");
            }
            System.out.println(Thread.currentThread().getName() + " finished");
        }
    }

    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread1 = new Thread(myRunnable, "MyRummable Thread");
        myThread1.start();

        try {
            Thread.sleep(5000); // Mail class is sleeping!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Requesting stop");
        myRunnable.requestStop();
        System.out.println("Stop requested");

    }
}
