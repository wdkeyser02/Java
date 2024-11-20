public class ThreadLifeCycle {

    public static void main(String[] args) {
        
        System.out.println("\nMain is Started!\n");
        Thread t = new Thread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        

    }
}