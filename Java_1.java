public class Java_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        Runnable myRunnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("I am a Runnable");
                
            }
            
        };

        runSomthing(myRunnable);
    }

    private static void runSomthing(Runnable runnable) {
        runnable.run();
    }
}
