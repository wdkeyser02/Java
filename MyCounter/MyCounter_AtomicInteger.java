package MyCounter;
import java.util.concurrent.atomic.AtomicInteger;

public class MyCounter_AtomicInteger {
    private AtomicInteger counter = new AtomicInteger();

    public void increment() {
        this.counter.incrementAndGet();
    }

    public int get() {
        return this.counter.get();
    }
}
