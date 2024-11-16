import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_6 {

    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        });
        executorService.shutdown();
    }
}
