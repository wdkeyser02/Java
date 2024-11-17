public class Thread_19 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Threads\n");
        Thread_19 main = new Thread_19();
        main.start();
    }

    public void start() {
        //This code is run by the 'waiting' thread
        Object monitorObj = new Object();
        Worker worker = new Worker(monitorObj); //Our worker object now has access to the same object monitorObj as this thread
        //Therefore, both the waiting thread and the worker thread have the same object to synchronize upon

        Thread thread = new Thread(worker);
        
        
        synchronized(monitorObj) { //Claiming monitorObj's monitor
            System.out.println("About to start the worker thread");
            thread.start(); //The worker thread has been started
            try {
                System.out.println("This thread is going to pause until another thread wakes it up");
                monitorObj.wait(); //This thread now pauses and releases the monitor. It can be claimed by any other thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("This thread has now resumed since Worker has called notify() and released the monitor");
    }
}

class Worker implements Runnable {

    private Object monitor;

    public Worker(Object monitorObj) {
        monitor = monitorObj;
    }

    @Override
    public void run() {
        System.out.println("Waiting to acquire the monitor");
        synchronized(monitor) {
            System.out.println("About to wake up the waiting thread");
            monitor.notify();
        }
        //Now that we are out of the synchronized block, the Worker thread has released the monitor
        //Furthermore, notify() was invoked in the synchronized block above
        System.out.println("Now that the waiting thread has woken up, this Worker thread can continue running as usual");
        //The worker thread continues running and executes additional code that may be present here
    }

}
