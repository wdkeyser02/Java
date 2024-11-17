public class Thread_1 {

    public static class MyThread extends Thread {

        public MyThread(String name) {
            this.setName(name);
        }

        @Override
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        Thread myThread = new MyThread("My Thread");
        myThread.start();
        System.out.println("Thread: " + myThread.getName() + " - " + myThread.threadId());
    }
}
