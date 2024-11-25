public class JavaGeneric {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        MyPrinter<Integer> integerPrinter = new MyPrinter<>(10);
        integerPrinter.Print();

        System.out.println("\nDouble");

        MyPrinter<Double> doublePrinter = new MyPrinter<>(10.0);
        doublePrinter.Print();

        System.out.println("\nString");

        MyPrinter<String> stringPrinter = new MyPrinter<>("10");
        stringPrinter.Print();

    }
}

class MyPrinter<T>{

    private T value;
    
    public MyPrinter(T value) {
        this.value = value;
    }

    public void Print() {
        System.err.println("Print: " + value);
    }
}
