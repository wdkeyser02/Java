public class JavaGeneric1 {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        MyPrinter1<Integer> integerPrinter = new MyPrinter1<>(10, 20);
        integerPrinter.Print();

        System.out.println("\nDouble");

        MyPrinter1<Double> doublePrinter = new MyPrinter1<>(10.0, 20.0);
        doublePrinter.Print();
    }
}

class MyPrinter1 <T>{

    private T value1;
    private T value2;
    
    public MyPrinter1(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void Print() {
        System.err.println("Print: " + value1 + " - " + value2);
    }
}
