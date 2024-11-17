import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.StructuredTaskScope;

public interface Thread_7B {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nJAVA Threads\n");
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var task1 = scope.fork(() -> {
                Thread.sleep(2000);
                throw new RuntimeException();
                //return "Task 1";
            });
            var task2 = scope.fork(() -> {
                Thread.sleep(3000);
                return "Task 2";
            });
            var task3 = scope.fork(() -> {
                Thread.sleep(50000);
                return "Task 3";
            });

            var before = Instant.now();
            System.out.println("Waiting on results!");
            scope.join().throwIfFailed();
            var time = Duration.between(before, Instant.now());
            System.out.println("Results: " + task1.get() + " - " + task2.get() + " - " + task3.get() + " in " + time);

        }
    }
}

