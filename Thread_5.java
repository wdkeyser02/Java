import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Thread_5 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nJAVA Threads\n");
        int maxRounds = 100_000;
        long begin = System.nanoTime();
        AtomicInteger counter = new AtomicInteger();
        List<Thread> threads = IntStream.range(0, maxRounds)
        .mapToObj(i -> Thread.ofVirtual().unstarted(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter.incrementAndGet();
        })).toList();

        for(Thread thread : threads) {
            thread.start();
        }
        for(Thread thread : threads) {
            thread.join();
        }
        long end = System.nanoTime();

        System.out.println("Time taken: " + (end-begin) / 1_000_000 + "ms");
        System.out.println("Rounds done: " + counter.get());
    }
}
