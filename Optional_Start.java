import java.util.Arrays;
import java.util.Optional;

public class Optional_Start {
    public static void main(String[] args) {
        
        System.out.println("JAVA Optionals\n"); 

        Optional<Integer> numberEmpty = Optional.empty();
        Optional<Integer> numberPresent = Optional.of(1);
        Optional<Integer> numberNullableEmpty = Optional.ofNullable(null);
        Optional<Integer> numberNullablePresent = Optional.ofNullable(1);
        Optional<Integer> numberFindElementEmpty = findNumber(new Integer[]{1, 2, 3, 4, 5}, 6);
        Optional<Integer> numberFindElementPresent = findNumber(new Integer[]{1, 2, 3, 4, 5}, 1);
        System.out.println(numberEmpty + " - Is Empty:" + numberEmpty.isEmpty() + " - Is Present:" + numberEmpty.isPresent());
        System.out.println(numberPresent + " - Is Empty:" + numberPresent.isEmpty() + " - Is Present:" + numberPresent.isPresent());
        System.out.println(numberNullableEmpty + " - Is Empty:" + numberNullableEmpty.isEmpty() + " - Is Present:" + numberNullableEmpty.isPresent());
        System.out.println(numberNullablePresent + " - Is Empty:" + numberNullablePresent.isEmpty() + " - Is Present:" + numberNullablePresent.isPresent());
        System.out.println(numberFindElementEmpty + " - Is Empty:" + numberFindElementEmpty.isEmpty() + " - Is Present:" + numberFindElementEmpty.isPresent());
        System.out.println(numberFindElementPresent + " - Is Empty:" + numberFindElementPresent.isEmpty() + " - Is Present:" + numberFindElementPresent.isPresent());
        System.out.println("\n"); 

    }

    public static Optional<Integer> findNumber(Integer[] arr, int x) {
        return Arrays.stream(arr).filter(num -> num == x).findFirst();
    }
    
}
