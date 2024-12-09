public class ThreadLocal_2 {
    public static void main(String[] args) {

        System.out.println("\nJava thread\n");
        MyRunnable sharedRunnableInstance = new MyRunnable();
 
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
 
        thread1.start();
        thread2.start();
    }

    public static class MyRunnable implements Runnable {
 
        private ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();
   
        @Override
        public void run() {
            threadLocal.set( (int) (Math.random() * 100D) );
            try {
                Thread.sleep(2000); //sleep for 2 secs
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
            System.out.println(threadLocal.get());
        }
     }
}
