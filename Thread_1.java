public class Thread_1 {
    public static void main(String[] args) {

        System.out.println("\nJava thread\n");
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Main Class!");

        Thread thread1 = new Thread(() -> {
            threadLocal.set("Thread 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = threadLocal.get();
            System.out.println("Thread: " + name);
            threadLocal.remove();
            System.out.println("Thread: " + threadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = threadLocal.get();
            System.out.println("Thread: " + name);
            threadLocal.remove();
            System.out.println("Thread: " + threadLocal.get());
        });

        Thread thread3 = new Thread(() -> {
            threadLocal.set("Thread 3");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = threadLocal.get();
            System.out.println("Thread: " + name);
            threadLocal.remove();
            System.out.println("Thread: " + threadLocal.get());
        });

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String name = threadLocal.get();
        System.out.println("Thread: " + name);
        threadLocal.remove();
        System.out.println("Thread: " + threadLocal.get());
    }
}
