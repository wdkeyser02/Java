import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.StructuredTaskScope;
import java.util.function.Supplier;

public class Thread_8 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        //noconcurrency();
        structuredConcurrency();
        //structuredConcurrencyException();
        //structuredConcurrencySuccess();
        //structuredConcurrencyDeadline();
        //unstructuredConcurrency();
        //unstructuredConcurrencyException();
        
    }

    private static void noconcurrency() {
        try {
            long start = System.currentTimeMillis();
            int first = getFirst();
            int second = getSecond();
            long end = System.currentTimeMillis();
            System.out.println("The sum is " + (first + second));
            System.out.println("Time taken " + (end - start) / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void structuredConcurrency() {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Supplier<Integer> firstTask = scope.fork(() -> getFirst());
            Supplier<Integer> secondTask = scope.fork(() -> getSecond());
            scope.join().throwIfFailed();
            int first = firstTask.get();
            int second = secondTask.get();
            int sum = first + second;
            System.out.println("The sum is :" + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void structuredConcurrencyException() {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Supplier<Integer> firstTask = scope.fork(() -> getFirst());
            Supplier<Integer> secondTask = scope.fork(() -> getSecondException());
            scope.join().throwIfFailed();
            int first = firstTask.get();
            int second = secondTask.get();
            int sum = first + second;
            System.out.println("The sum is :" + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void structuredConcurrencyDeadline() {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Supplier<Integer> firstTask = scope.fork(() -> getFirst());
            Supplier<Integer> secondTask = scope.fork(() -> getSecondSlower());
            scope.joinUntil(Instant.now().plusSeconds(5)).throwIfFailed();
            int first = firstTask.get();
            int second = secondTask.get();
            int sum = first + second;
            System.out.println("The sum is :" + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void structuredConcurrencySuccess() {
        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<>()) {
            scope.fork(() -> getFirst());
            scope.fork(() -> getSecondSlower());
            int result = (int) scope.join().result();
            System.out.println("The result is :" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void unstructuredConcurrency() {
        try (var executor = Executors.newCachedThreadPool()) {
            long start = System.currentTimeMillis();
            Future<Integer> firstTask = executor.submit(() -> getFirst());
            Future<Integer> secondTask = executor.submit(() -> getSecond());
            int first = firstTask.get();
            int second = secondTask.get();
            long end = System.currentTimeMillis();
            System.out.println("Time taken " + (end - start) / 1000);
            System.out.println("The sum is " + first + second);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void unstructuredConcurrencyException() {
        try (var executor = Executors.newCachedThreadPool()) {
            long start = System.currentTimeMillis();
            Future<Integer> firstTask = executor.submit(() -> getFirst());
            Future<Integer> secondTask = executor.submit(() -> getSecondException());
            int first = firstTask.get();
            int second = secondTask.get();
            long end = System.currentTimeMillis();
            System.out.println("Time taken " + (end - start) / 1000);
            System.out.println("The sum is " + first + second);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static int getFirst() throws Exception {
        Thread.sleep(Duration.ofSeconds(5));
        System.out.println("Returning 100");
        return 100;
    }
    private static int getSecond() throws Exception {
        Thread.sleep(Duration.ofSeconds(5));
        System.out.println("Returning 400");
        return 400;
    }
    private static int getSecondException() throws Exception {
        int a = 5 / 0;
        Thread.sleep(Duration.ofSeconds(5));
        System.out.println("Returning 400");
        return 400;
    }
    private static int getSecondSlower() throws Exception {
        Thread.sleep(Duration.ofSeconds(6));
        System.out.println("Returning 400");
        return 400;
    }
}
