import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_6 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        try(ExecutorService virtualExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            for(int i=0; i<10; i++) {
                int tasknumber = i +1;
                Runnable task = () -> taskRunner(tasknumber);
                virtualExecutor.submit(task);
            }
        } 
    }

    private static void taskRunner(int number) {
        System.out.println("Task " + number + " executed by Virtual Thread: " + Thread.currentThread());
    }
}
