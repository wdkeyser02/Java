import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.StructuredTaskScope;

public class Thread_13 {
    public static void main(String[] args) throws Exception {

        System.out.println("\nJAVA Threads\n");

        try (var scope = new BestResultScope<>(2)) {
            scope.fork(() -> {
                Thread.sleep(2000);
                System.out.println("Task 1 done!");
                return "Task 1";
            });
            scope.fork(() -> {
                Thread.sleep(3000);
                System.out.println("Task 2 done!");
                return "Task 2";
            });
            scope.fork(() -> {
                Thread.sleep(4000);
                System.out.println("Task 3 done!");
                return "Task 3";
            });
            System.out.println("Waiting on results!");
            scope.join();
            System.out.println("Results: " + scope.bestResult());
        }
    }
        
}

class BestResultScope<T> extends StructuredTaskScope<T> {
  
    private List<String> resultList = new ArrayList<>();
    private int numberOfItems;

    public BestResultScope(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    protected void handleComplete(Subtask<? extends T> subtask) {
        
        switch (subtask.state()) {
            case UNAVAILABLE -> System.out.println("BestResultScope Unavailable");
            case SUCCESS -> {
                System.out.println("BestResultScope Success");
                synchronized (this) {
                    resultList.add(subtask.get().toString());
                }
                if(resultList.size() == numberOfItems) {
                    super.shutdown();   
                }
            }
            case FAILED -> System.out.println("BestResultScope Exeption");
          }
    }
  
    public List<String> bestResult() {
        return resultList;
    }
  }