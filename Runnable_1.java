public class Runnable_1 implements Runnable {

    @Override
    public void run() {
        
        String threadName = Thread.currentThread().getName();
        for (int index = 0; index <= 5; index++) {
            System.out.println("Thread " + threadName + " Running: " +  index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
