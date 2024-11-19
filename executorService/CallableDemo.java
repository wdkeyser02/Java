package executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        
        System.out.println("\nMain is Started!\n");
        try(ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            Future<Integer> result = executorService.submit(new ReturnValueTask());

            //result.cancel(true);
            //boolean cancelled = result.isCancelled();
            //boolean done = result.isDone();

            System.out.println(result.get(20, TimeUnit.SECONDS));
            System.out.println("Main thread execution completed! ");
        }
    }
}

class ReturnValueTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 12;
    }
}