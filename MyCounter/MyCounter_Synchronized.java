package MyCounter;
public class MyCounter_Synchronized {
    private int counter = 0;

    public synchronized void increment() {
        this.counter++;
    }

    public int get() {
        return counter;
    }
}
