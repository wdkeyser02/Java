import java.util.stream.IntStream;

public class Thread_2 extends Thread {
    private int threadNumber;
    private int sleep;

    public Thread_2(int threadNumber, int sleep) {
        this.threadNumber = threadNumber;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        IntStream.range(0, 6)
            .forEach(index -> {
                System.out.println("Thread " + threadNumber + " Running: " +  index);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        System.out.println("Thread " + threadNumber + "  done!");    
    }
}