package executorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {

    public static void main(String[] args) {

        System.out.println("\nMain is Started!\n");
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 5; i++) {
                service.execute(new MyTask(i));
            }
        }
    }
}

class MyTask implements Runnable {

    private final int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task with ID : " + taskId + " being executed by thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
