import java.util.List;
import java.util.stream.IntStream;

public class Thread_3 {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("\nJAVA Threads\n");
        List<Thread> threads = IntStream.range(0, 100).mapToObj(i -> Thread.ofVirtual().unstarted(() -> {
            if(i == 0) {
                System.out.println(Thread.currentThread());
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 0) {
                System.out.println(Thread.currentThread());
            }

        })).toList();

        threads.forEach(Thread::start);

        System.out.println("Cores: " + Runtime.getRuntime().availableProcessors());
        for(Thread thread : threads) {
            thread.join();
        }
    }
}
