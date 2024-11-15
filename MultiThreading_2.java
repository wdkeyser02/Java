public class MultiThreading_2 implements Runnable {

    public static void main(String[] args) {
        
        System.out.println("\nJava Threads started!\n");
        MultiThreading_2 myThread = new MultiThreading_2();

        Thread myThreadThread1 = new Thread(myThread);
        Thread myThreadThread2 = new Thread(myThread);
        Thread myThreadThread3 = new Thread(myThread);
        Thread myThreadThread4 = new Thread(myThread);
        
        myThreadThread1.start();
        myThreadThread2.start();
        myThreadThread3.start();
        myThreadThread4.start();

        try {
            myThreadThread1.join();
            myThreadThread2.join();
            myThreadThread3.join();
            myThreadThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nJava Threads done!\n");
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int index = 0; index <= 5; index++) {
            System.out.println("Thread " + threadName + " Running: " +  index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    

    

}
