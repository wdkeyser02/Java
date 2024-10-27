import java.util.Optional;
import java.util.Random;

public class Optional_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Optional.\n");

        Optional<String> myOptional = myRandomString();    // A container object which may or may not contain a non-null value. 
                                                            // If a value is present, isPresent() returns true. 
                                                            // If no value is present, the object is considered empty and isPresent() returns false.

        
        System.out.println(myOptional.orElse("No text!"));
        
        if (myOptional.isPresent()) {
            System.out.println("Optional is present!");            
        } else {
            System.out.println("Optional is not present!");   
        }
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
