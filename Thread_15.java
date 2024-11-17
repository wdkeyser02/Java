import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Thread_15 {
    public static void main(String[] args) {
        
        // The Executor Framework

        System.out.println("\nJAVA Threads\n");
        Executor executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Task is executing...");
        };

        executor.execute(task);
    }
}
