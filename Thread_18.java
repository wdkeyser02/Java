public class Thread_18 {
    public static void main(String[] args) {
        
        // Daemon Threads

        System.out.println("\nJAVA Threads\n");
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Task is running!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true); // Set as a daemon thread
        daemonThread.start();
    }
}
