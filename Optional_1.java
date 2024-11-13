import java.util.Optional;
import java.util.Random;

public class Optional_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Optional.\n");

        Optional<String> myOptional = myRandomString();
        myOptional.ifPresentOrElse(myString -> System.out.println("String: " + myString + " Length: " + myString.length())
            , () -> System.out.println("No text!"));
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
