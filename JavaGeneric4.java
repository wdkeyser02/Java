public class JavaGeneric4 {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        MyPrinter4<Integer> integerPrinter = new MyPrinter4<>(10);
        System.out.println(integerPrinter.Print());

        System.out.println("\nDouble");

        MyPrinter4<Double> doublePrinter = new MyPrinter4<>(10.0);
        System.out.println(doublePrinter.Print());
    }
}

class MyPrinter4<T extends Number>{

    private T value;
    
    public MyPrinter4(T value) {
        this.value = value;
    }

    public T Print() {
        return value;
    }
}
