import java.util.Optional;

public class Optional_Start_2 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Optionals\n"); 
        
        Optional<Integer> numberPresent = Optional.of(1); // or Optional.ofNullable(1)

        System.out.println("numberPresent: " + numberPresent);
        System.out.println("isPresent: " + numberPresent.isPresent());
        System.out.println("isEmpty: " + numberPresent.isEmpty());
        System.out.println("or: " + numberPresent.or(() -> Optional.of(0)));
        System.out.println("orElse: " + numberPresent.orElse(0));
        
        System.out.println("get: " + numberPresent.get());
        System.out.println("orElseThrow: " + numberPresent.orElseThrow());

        numberPresent.ifPresent((present) -> System.out.println("ifPresent: " + present));
        numberPresent.ifPresentOrElse(
            number -> System.out.println("ifPresentOrElse: " + number),
            () -> System.out.println("Optional is empty!")
        );
    }
}
