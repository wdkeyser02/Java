public class Java1 {

    public static void main(String[] args) {
        

        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        IntegerSum integerSum = new IntegerSum(10, 20);
        integerSum.IntegerPrinter();

        System.out.println("\nDouble");

        DoubleSum doubleSum = new DoubleSum(10.0, 20.0);
        doubleSum.DoublePrinter();
    }
}

class IntegerSum {

    private Integer value1;
    private Integer value2;
    
    public IntegerSum(Integer value1, Integer value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void IntegerPrinter() {
        System.err.println("Sum: " + value1 + " - " + value2);
    }
}

class DoubleSum {

    private Double value1;
    private Double value2;
    
    public DoubleSum(Double value1, Double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void DoublePrinter() {
        System.err.println("Sum: " + value1 + " - " + value2);
    }
}