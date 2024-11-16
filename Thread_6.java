import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Thread_6 {
    public static void main(String[] args) {

        System.out.println("\nJAVA Threads\n");
        ThreadFactory virtualThreadFactory = Thread.ofVirtual().factory();
        ExecutorService executor = Executors.newFixedThreadPool(8, virtualThreadFactory);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                System.out.println("Running task in a virtual thread: "
                                   + Thread.currentThread().threadId());
            });
        }

        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
