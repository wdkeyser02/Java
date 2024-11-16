import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_5 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

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
