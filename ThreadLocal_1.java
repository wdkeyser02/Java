public class ThreadLocal_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava thread\n");
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();
    }

    public static class MyRunnable implements Runnable {

        private Object data = null;

        @Override
        public void run() {
            synchronized(this) {
                data = (int) (Math.random() * 100D);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
            synchronized(this) {
                System.out.println(data);
            }
        }
    }
}
