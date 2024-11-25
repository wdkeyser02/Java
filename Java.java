public class Java {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        IntegerPrinter integerPrinter = new IntegerPrinter(10);
        integerPrinter.IntegerPrint();

        System.out.println("\nDouble");

        DoublePrinter doublePrinter = new DoublePrinter(10.0);
        doublePrinter.DoublePrint();
    }
}

class IntegerPrinter {

    private Integer value;
    
    public IntegerPrinter(Integer value) {
        this.value = value;
    }

    public void IntegerPrint() {
        System.err.println("Print: " + value);
    }
}

class DoublePrinter {

    private Double value;
   
    
    public DoublePrinter(Double value) {
        this.value = value;
    }

    public void DoublePrint() {
        System.err.println("Print: " + value);
    }
}