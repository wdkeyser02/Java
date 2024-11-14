public class Java {
    public static void main(String[] args) {

        System.out.println("\nJAVA Lambda\n");
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("I am a Runnable");
                
            }
            
        };

        runnable.run();
        
    }
}
