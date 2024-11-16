import java.util.concurrent.CompletableFuture;

public class Thread_4 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        CompletableFuture<Void> myThread = CompletableFuture
            .supplyAsync(() -> "Virtual Thread")
            .thenApplyAsync(result -> result.toUpperCase())
            .thenAcceptAsync(result -> {
                System.out.println("Result: " + result + " in Thread: " + Thread.currentThread().getName());
            });
        myThread.join();    
    }
}
