public class MultiThreading_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Threads\n");
        Runnable_1 myThread = new Runnable_1();

        Thread myThreadThread1 = new Thread(myThread);
        Thread myThreadThread2 = new Thread(myThread);
        Thread myThreadThread3 = new Thread(myThread);
        Thread myThreadThread4 = new Thread(myThread);
        
        myThreadThread1.start();
        myThreadThread2.start();
        myThreadThread3.start();
        myThreadThread4.start();
    }
}
