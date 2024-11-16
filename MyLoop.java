public class MyLoop {
    
    private boolean done = false;
    //private volatile boolean done = false;

    public void loop() throws InterruptedException {
        for(int i = 0; i < 3; i++) {
            Thread.sleep(1000);
        }
        done = true;
    }

    public void waitToFinisch() {
        while (!done);
    }
}
