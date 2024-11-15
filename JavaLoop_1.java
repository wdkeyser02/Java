import java.util.stream.IntStream;

public class JavaLoop_1 {
    
    private int loopNumber;

    public JavaLoop_1(int loopNumber) {
        this.loopNumber = loopNumber;
    }

    public void loop() {
        IntStream.range(0, 6)
            .forEach(index -> {
                System.out.println("Loop " + loopNumber + " Running: " +  index);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
    }

}
