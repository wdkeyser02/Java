import java.util.ArrayList;
import java.util.List;

public class Javageneric5 {
    public static void main(String[] args) {
        
        System.out.println("\nMy Java tutorials\n");

        System.out.println("\nInteger");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        myPrintlist(integerList);

        System.out.println("\nDouble");

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.0);
        myPrintlist(doubleList);

        System.out.println("\nString");

        List<String> stringList = new ArrayList<>();
        stringList.add("10");
        myPrintlist(stringList);

    }


    private static void myPrintlist(List<?> myList) {

        System.out.println("List: " + myList);
    }
}
