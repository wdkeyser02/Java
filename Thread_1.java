public class Thread_1 extends Thread {
    
    private int threadNumber;

    public Thread_1(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {
        for (int index = 0; index <= 5; index++) {
            System.out.println("Thread " + threadNumber + " Running: " +  index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
