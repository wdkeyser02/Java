public class Thread_MyCounter {

    private static final MyCounter myCounter = new MyCounter();
    //private static final MyCounter_Synchronized myCounter = new MyCounter_Synchronized();
    //private static final MyCounter_AtomicInteger myCounter = new MyCounter_AtomicInteger();
    private static final int numThreads = 5;
    private static final int numCounter = 100_000;

    public static void main(String[] args) {
        for(int i = 1; i <= numThreads; i++) {
            Thread myThread = new Thread(new Task(), "Task-" + i);
            myThread.start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("MyCounter: " + myCounter.get());
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " running");
            try {
                for(int i = 0; i < numCounter; i++) {
                    myCounter.increment();
                }
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
            System.out.println(Thread.currentThread().getName() + " is Done! " + myCounter.get());
        }
    }
}
