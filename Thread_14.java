public class Thread_14 {
    public static void main(String[] args) {
        
        // Deadlocks and Solutions
        
        System.out.println("\nJAVA Threads\n");
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread thread1 = new Thread(() -> resource1.method1(resource2));
        Thread thread2 = new Thread(() -> resource2.method1(resource1));

        thread1.start();
        thread2.start();
    }
    
}

class Resource {
    public synchronized void method1(Resource other) {
        System.out.println("Task method 1 begin");
        other.method2(this);
        System.out.println("Task method 1 end");
    }

    public synchronized void method2(Resource other) {
        System.out.println("Task method 2 begin");
        other.method1(this);
        System.out.println("Task method 2 end");
    }
}
