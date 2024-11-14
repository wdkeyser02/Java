import java.util.ArrayList;
import java.util.List;

public class LambdaExample_1 {
    public static void main(String[] args) {

        System.out.println("\nJAVA Lambda\n");
        List<LambdaExampleInterface> operations = new ArrayList<>();
        operations.add((a, b) -> a + b);
        operations.add((a, b) -> a - b);
        operations.add((a, b) -> a * b);
        operations.add((a, b) -> a / b);
        double value1 = 50.0;
        double value2 = 10.0;
        
        operations.forEach(operation -> System.out.println(operation.calc(value1, value2)));
        // for (var operation : operations) {
        //    System.out.println(operation.calc(value1, value2));
        // }

    }

    @FunctionalInterface
    private interface LambdaExampleInterface {
        public double calc(double a, double b);
    }

}