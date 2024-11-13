import java.util.Optional;

public class Optional_Start_2 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Optionals\n"); 
        
        Optional<Integer> numberPresnet = Optional.of(1); // or Optional.ofNullable(1)

        System.out.println("numberPresnet: " + numberPresnet);
        System.out.println("isPresent: " + numberPresnet.isPresent());
        System.out.println("isEmpty: " + numberPresnet.isEmpty());
        System.out.println("or: " + numberPresnet.or(() -> Optional.of(0)));
        System.out.println("orElse: " + numberPresnet.orElse(0));
        
        System.out.println("get: " + numberPresnet.get());
        System.out.println("orElseThrow: " + numberPresnet.orElseThrow());

        numberPresnet.ifPresent((present) -> System.out.println("ifPresent: " + present));
        numberPresnet.ifPresentOrElse(
            number -> System.out.println("ifPresentOrElse: " + number),
            () -> System.out.println("Optional is empty!")
        );
    }
}
