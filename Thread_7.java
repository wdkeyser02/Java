import java.util.ArrayList;
import java.util.List;

public class Thread_7 {
    public static void main(String[] args) {
        System.out.println("\nJAVA Threads\n");
        
        List<Thread> virtualThreads = new ArrayList<>();
        int virtualThreadCount = 100_000;

        for(int i=0; i<=virtualThreadCount; i++) {
            int virtualThreadIndex = i;
            Thread virtualThread = Thread.ofVirtual().start(() -> {
                int result = 1;
                for(int j=0; j<10; j++) {
                    result *=(j + 1);
                }
                System.out.println("Result[" + virtualThreadIndex + "]: " + result);
            });
            virtualThreads.add(virtualThread);
        }
        for(int i=0; i< virtualThreads.size(); i++) {
            try {
                virtualThreads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
