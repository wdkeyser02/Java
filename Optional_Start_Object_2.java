import java.util.Optional;

public class Optional_Start_Object_2 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Optionals\n"); 
        
        Optional<Person> personPresent = Optional.of(new Person(1, "Bill", "Gates", "password", 56)); 
                // or Optional.ofNullable(new Person(1, "Bill", "Gates", "password", 56))

        System.out.println("NumberEmpty: " + personPresent);
        System.out.println("isPresent: " + personPresent.isPresent());
        System.out.println("isEmpty: " + personPresent.isEmpty());
        System.out.println("or: " + personPresent.or(() -> Optional.of(new Person(0, "", "", "", 0))));
        System.out.println("orElse: " + personPresent.orElse(new Person(0, "", "", "", 0)));
        System.out.println("get: " + personPresent.get());
        System.out.println("orElseThrow: " + personPresent.orElseThrow());

        personPresent.ifPresent((present) -> System.out.println("ifPresent: " + present));
        personPresent.ifPresentOrElse(
            number -> System.out.println("ifPresentOrElse: " + number),
            () -> System.out.println("Optional is empty!")
        );
    }

    public record Person(Integer id, String firstName, String lastName, String password, Integer age) {}
}
