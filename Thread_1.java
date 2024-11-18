

public class Thread_1 {
    public static void main(String[] args) {
        
        System.out.println("\nMain is Started!\n");
        Thread.Builder myThreadBuilder = Thread.ofPlatform().name("myThread");
        
        Thread thread = myThreadBuilder.start(new Task());
        System.out.println("Thread name is: " + thread.getName());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main is Done!");
        
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("Task running");
            try {
                for (int index = 0; index <= 5; index++) {
                    System.out.println("Index: " + index);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task is Done!");
        
        }
        
    }
}
