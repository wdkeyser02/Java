public class MultiThreading_3 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Threads\n");
        Thread_1 myThread1 = new Thread_1(1);
        Thread_1 myThread2 = new Thread_1(2);
        Thread_1 myThread3 = new Thread_1(3);
        Thread_1 myThread4 = new Thread_1(4);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

    }
}
