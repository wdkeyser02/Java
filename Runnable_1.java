import java.util.stream.IntStream;

public class Runnable_1 implements Runnable {

    @Override
    public void run() {
        
        String threadName = Thread.currentThread().getName();
        IntStream.range(0, 6).forEach(index ->
            {
                System.out.println("Thread " + threadName + " Running: " +  index);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        //for (int index = 0; index <= 5; index++) {
        //    System.out.println("Thread " + threadName + " Running: " +  index);
        //    try {
        //        Thread.sleep(1000);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }

        }

}
