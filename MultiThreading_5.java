public class MultiThreading_5 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Threads started!\n");
        Thread_2 myThread1 = new Thread_2(1, 200);
        Thread_2 myThread2 = new Thread_2(2, 400);
        Thread_2 myThread3 = new Thread_2(3, 600);
        Thread_2 myThread4 = new Thread_2(4, 800);
        Thread_2 myThread5 = new Thread_2(5, 1000);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();

        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
            myThread4.join();
            myThread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nJava Threads continue with the rest of the code!\n");
    }
}
