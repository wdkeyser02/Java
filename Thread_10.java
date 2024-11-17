import java.util.concurrent.StructuredTaskScope;

public class Thread_10 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        // creating the scope
        try (var scope = new StructuredTaskScope<Integer>()) {
        // forking subtasks
            StructuredTaskScope.Subtask<Integer> subtask1 = scope.fork(() -> 1);
            StructuredTaskScope.Subtask<Integer> subtask2 = scope.fork(() -> {
                System.out.println("starting subtask2");
                Thread.sleep(1_000);
                System.out.println("subtask2 completed");
                return 2;
            });
            StructuredTaskScope.Subtask<Integer> subtask3 = scope.fork(() -> 3);

            // waiting 500ms
            Thread.sleep(500);
            // shutting down the scope
            scope.shutdown();
            scope.join();

            // printing results
            System.out.println(printSubTask("subtask1", subtask1));
            System.out.println(printSubTask("subtask2", subtask2));
            System.out.println(printSubTask("subtask3", subtask3));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static String printSubTask(String name, StructuredTaskScope.Subtask<Integer> subTask) {
        String state = subTask.state().toString();
        String value = "";
        if (state.equals("FAILED")) {
            return name + " state: " + state + " EXCEPTION : Runtime error in " + name; 
        }
        if (state.equals("UNAVAILABLE")) {
            return name + " state: " + state + " value: null"; 
        } 
            
        return name + " state: " + state + " value: " + value;
    }
}
