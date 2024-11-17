import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;

public class Thread_7A {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nJAVA Threads\n");
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            var task1 = executor.submit(() -> {
                Thread.sleep(2000);
                // throw new RuntimeException();
                return "Task 1";
            });
            var task2 = executor.submit(() -> {
                Thread.sleep(4000);
                return "Task 2";
            });
            var task3 = executor.submit(() -> {
                Thread.sleep(6000);
                return "Task 3";
            });

            var before = Instant.now();
            System.out.println("Waiting on results!");
            var result1 = task1.get();
            System.out.println("Got first result.");
            var result2 = task2.get();
            System.out.println("Got second result.");
            var result3 = task3.get();
            var time = Duration.between(before, Instant.now());
            System.out.println("Results: " + result1 + " - " + result2 + " - " + result3 + " in " + time);

        }
    }
}



