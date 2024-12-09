import java.util.concurrent.atomic.AtomicReference;

public class Thread_2 {
    public static void main(String[] args) {
        
        System.out.println("\nJava thread\n");
        AtomicReference<String> atomicReference = new AtomicReference<>();
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<String> inheritableThreadLocal =new InheritableThreadLocal<>();
        threadLocal.set("ThreadLocal from Main Class!");
        inheritableThreadLocal.set("InheritableThreadLocal from Main Class");
        atomicReference.set("AtomicReference from Main Class!");

        System.out.println("Main Thread: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());

        Thread parentThread = new Thread(() -> {
            System.out.println("\n====== Parent Thread ======");
            System.out.println("Parent Thread: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
            threadLocal.set("Parent Thread - ThreadLocal");
            inheritableThreadLocal.set("Parent Thread - InheritableThreadLocal");
            atomicReference.set("Parent Thread - AtomicReference");
            System.out.println("Parent Thread: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());

            Thread childThread1 = new Thread(() -> {
                System.out.println("\n====== Child Thread 1 ======");
                System.out.println("Child Thread 1: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
                threadLocal.set("Child Thread 1 - ThreadLocal");
                inheritableThreadLocal.set("Child Thread 1 - InheritableThreadLocal");
                atomicReference.set("Child Thread 1 - AtomicReference");
                System.out.println("Child Thread 1: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
            });

            Thread childThread2 = new Thread(() -> {
                System.out.println("\n====== Child Thread 2 ======");
                System.out.println("Child Thread 2: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
                threadLocal.set("Child Thread 2 - ThreadLocal");
                inheritableThreadLocal.set("Child Thread 2 - InheritableThreadLocal");
                atomicReference.set("Child Thread 2 - AtomicReference");
                System.out.println("Child Thread 2: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
            });

            childThread1.start();
            try {
                childThread1.join();
            } catch (InterruptedException e) {
            }

            childThread2.start();
            try {
                childThread2.join();
            } catch (InterruptedException e) {
            }

            System.out.println("\nParent Thread after child Threads are done: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
        });
        parentThread.start();
        try {
            parentThread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("\n====== Main Thread ======");
        System.out.println("Main Thread: " + threadLocal.get() + " - " + inheritableThreadLocal.get() + " - " + atomicReference.get());
    }
}
