import java.util.Optional;

public class Optional_Start_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Optionals\n"); 
        
        Optional<Integer> numberEmpty = Optional.empty(); // or Optional.ofNullable(null)

        System.out.println("NumberEmpty: " + numberEmpty);
        System.out.println("isPresent: " + numberEmpty.isPresent());
        System.out.println("isEmpty: " + numberEmpty.isEmpty());
        System.out.println("or: " + numberEmpty.or(() -> Optional.of(0)));
        System.out.println("orElse: " + numberEmpty.orElse(0));
        //System.out.println("get: " + numberEmpty.get());
        //System.out.println("orElseThrow: " + numberEmpty.orElseThrow());

        numberEmpty.ifPresent((present) -> System.out.println("ifPresent: " + present));
        numberEmpty.ifPresentOrElse(
            number -> System.out.println("ifPresentOrElse: " + number),
            () -> System.out.println("Optional is empty!")
        );
        
    }
}
