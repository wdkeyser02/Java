import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_16 {
    public static void main(String[] args) {
        
        // Thread Pools
        
        System.out.println("\nJAVA Threads\n");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task 1 is executing...");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 is executing...");
        };

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
    }
}
