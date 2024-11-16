import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_7 {
    
    public static class MyThread {
        
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        MyThread myThread = new MyThread();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            myThread.run();
        });
        executorService.shutdown();
    }
}
