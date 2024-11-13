import java.util.Optional;
import java.util.Random;

public class Optional_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Optional.\n");

        Optional<String> myOptional = myRandomString();
        myOptional.ifPresentOrElse((text) -> System.out.println("Optional is present: " + text)
            , () -> System.out.println("Optional is not present!"));
        System.out.println("\n");
    }

    private static Optional<String> myRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return Optional.ofNullable("My Java Tutorials!");
        }
        return Optional.empty();
    }
}
