import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.StructuredTaskScope;

public class Thread_7C {
    public static void main(String[] args) throws Exception {

        System.out.println("\nJAVA Threads\n");
        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<String>()) {
            scope.fork(() -> {
                Thread.sleep(2000);
                return "Task 1";
            });
            scope.fork(() -> {
                Thread.sleep(1000);
                throw new RuntimeException();
                //return "Task 2";
            });
            scope.fork(() -> {
                Thread.sleep(20000);
                return "Task 3";
            });

            var before = Instant.now();
            System.out.println("Waiting on results!");
            var results = scope.join().result();
            var time = Duration.between(before, Instant.now());
            System.out.println("Results: " + results + " in " + time);
        }
    }
}

class MyStructuredTaskScope extends StructuredTaskScope<String> {

}
