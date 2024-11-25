public class JavaGeneric3 {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        MyPrinter3<Integer> integerPrinter = new MyPrinter3<>(10);
        integerPrinter.Print();

        System.out.println("\nDouble");

        MyPrinter3<Double> doublePrinter = new MyPrinter3<>(10.0);
        doublePrinter.Print();

        //System.out.println("\nString");

        //MyPrinter3<String> stringPrinter = new MyPrinter3<>("10");
        //stringPrinter.Print();
    }
}

class MyPrinter3<T extends Number>{

    private T value;
    
    public MyPrinter3(T value) {
        this.value = value;
    }

    public void Print() {
        System.err.println("Print: " + value);
    }
}