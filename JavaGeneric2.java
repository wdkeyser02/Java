public class JavaGeneric2 {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        MyPrinter2<Integer, Double> integerPrinter = new MyPrinter2<>(10, 20.0);
        integerPrinter.Print();

        System.out.println("\nDouble");

        MyPrinter2<Double, Integer> doublePrinter = new MyPrinter2<>(10.0, 20);
        doublePrinter.Print();
    }
}

class MyPrinter2<K, V>{

    private K value1;
    private V value2;
    
    public MyPrinter2(K value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void Print() {
        System.err.println("Print: " + value1 + " - " + value2);
    }
}
