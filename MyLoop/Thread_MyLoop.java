package MyLoop;
public class Thread_MyLoop {

    private static final MyLoop myLoop = new MyLoop();
    private static final int numThreads = 5;
    
    public static void main(String[] args) {
        for(int i = 0; i < numThreads; i++) {
            Thread myThread1 = new Thread(new Task1());
            Thread myThread2 = new Thread(new Task2());
            myThread1.start();
            myThread2.start();
        }
    }

    static class Task1 implements Runnable {
        @Override
        public void run() {
            System.out.println("Task " + Thread.currentThread().threadId() + " is running");
            try {
                myLoop.loop();
            } catch (InterruptedException e) {
                System.out.println("Exception is caught");
            }
            System.out.println("Task " + Thread.currentThread().threadId() + " is Done! ");
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            myLoop.waitToFinisch();
            System.out.println("Task " + Thread.currentThread().threadId() + " is Finisch! ");
        }
    }
}
