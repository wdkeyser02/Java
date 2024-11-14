public class Lambda {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        Runnable runnable = () -> System.out.println("I am a Runnable");

        runnable.run();
    }
}
