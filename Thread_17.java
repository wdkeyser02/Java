import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread_17 {
    public static void main(String[] args) {
        
        // Callable and Future

        System.out.println("\nJAVA Threads\n");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executorService.submit(task);

        System.out.println("Waiting for the result...");
        Integer result = 0;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Result: " + result);

        executorService.shutdown();
    }
}
