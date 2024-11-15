public class MultiThreading_4 extends Thread {
    public static void main(String[] args) {
        
        System.out.println("\nJava Threads\n");
        MultiThreading_4 multiThreading_1 = new MultiThreading_4();
        MultiThreading_4 multiThreading_2 = new MultiThreading_4();
        MultiThreading_4 multiThreading_3 = new MultiThreading_4();
        MultiThreading_4 multiThreading_4 = new MultiThreading_4();
        multiThreading_1.start();
        multiThreading_2.start();
        multiThreading_3.start();
        multiThreading_4.start();

    }

    @Override
    public void run() {
        for (int index = 0; index <= 5; index++) {
            System.out.println("Thread " + this.threadId() + " Running: " +  index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
