public class Lambda_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        Runnable myRunnable = () -> System.out.println("I am a Runnable");

        // Runnable myRunnable = () -> {
        //     System.out.println("I am a Runnable");
        //     System.out.println("Second line code");
        // };

        runSomething(myRunnable);
    }

    private static void runSomething(Runnable runnable) {
        runnable.run();
    }
}