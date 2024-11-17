public class UseCaseRunner {
    
    public static void main(String[] args) {
        
        System.out.println("\nMain is Started!\n");
        UseCaseTaskScheduler scheduler = new UseCaseTaskScheduler(2);
        scheduler.schedule(() -> System.out.println("Task 1 executed at specific time"), System.currentTimeMillis() + 5000);
        scheduler.scheduleAtFixedInterval(() -> System.out.println("Task 2 executed at fixed interval"), 2000);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        scheduler.shutdown();
    }
}
