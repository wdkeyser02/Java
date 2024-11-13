import java.util.Arrays;
import java.util.Optional;

public class Optional_Start {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Optionals\n"); 

        Optional<Integer> numberEmpty = Optional.empty();
        Optional<Integer> numberPresent = Optional.of(1);
        Optional<Integer> numberNullableEmpty = Optional.ofNullable(null);
        Optional<Integer> numberNullablePresent = Optional.ofNullable(1);
        Optional<Integer> numberFindElementEmpty = findNumber(listOfNumbers(), 6);
        Optional<Integer> numberFindElementPresent = findNumber(listOfNumbers(), 1);
        
        System.out.println("Optional Empty: " + numberEmpty + " - Is Empty:" + numberEmpty.isEmpty() 
            + " - Is Present:" + numberEmpty.isPresent());
        System.out.println("Optional Present: " + numberPresent + " - Is Empty:" + numberPresent.isEmpty() 
            + " - Is Present:" + numberPresent.isPresent());
        System.out.println("Optional Nullable Empty: " + numberNullableEmpty + " - Is Empty:" + numberNullableEmpty.isEmpty() 
            + " - Is Present:" + numberNullableEmpty.isPresent());
        System.out.println("Optional Nullable Present: " + numberNullablePresent + " - Is Empty:" + numberNullablePresent.isEmpty() 
            + " - Is Present:" + numberNullablePresent.isPresent());
        System.out.println("Optional Find Element Empty: " + numberFindElementEmpty + " - Is Empty:" + numberFindElementEmpty.isEmpty() 
            + " - Is Present:" + numberFindElementEmpty.isPresent());
        System.out.println("Optional Find Element Present: " + numberFindElementPresent + " - Is Empty:" + numberFindElementPresent.isEmpty() 
            + " - Is Present:" + numberFindElementPresent.isPresent());
        System.out.println("\n"); 

    }

    public static Optional<Integer> findNumber(Integer[] arr, int x) {
        return Arrays.stream(arr).filter(num -> num == x).findFirst();
    }
    
    public static Integer[] listOfNumbers() {
        return new Integer[]{1, 2, 3, 4, 5};
    }
}
