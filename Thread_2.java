public class Thread_2 {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("\nJAVA Threads\n");
        Thread platformThread = Thread.ofPlatform().unstarted(() -> System.out.println(Thread.currentThread()));
        platformThread.start();

        Thread virtualThread = Thread.ofVirtual().unstarted(() -> System.out.println(Thread.currentThread()));
        virtualThread.start();

        platformThread.join();
        virtualThread.join();

        System.out.println("Class " + virtualThread.getClass());
    }
}
