import java.util.Optional;

public class Optional_Start {
    public static void main(String[] args) {
        
        // Optional A container object which may or may not contain a non-null value.

        //  If no value is present, isPresent() will return false and get() will an empty Optional. 
        System.out.println("Empty");
        Optional<Person> personOptionalEmpty = Optional.empty();
        System.out.println("isPresent: " + personOptionalEmpty.isPresent());
        // System.out.println("get: " + personOptionalEmpty.get());
        personOptionalEmpty.ifPresent(person -> System.out.println("ifPresent: " + person));

        personOptionalEmpty.ifPresentOrElse(
            person -> System.out.println("ifPresentOrElse: " + person),
            () -> System.out.println("Person not found!")
        );

        System.out.println("\n");
        //  If a value is present, isPresent() will return true and get() will return the value.
        System.out.println("Present");
        Optional<Person> personOptionalPresent = Optional.of(new Person(1, "Bill", "Gates", "password", 50));
        System.out.println("isPresent: " + personOptionalPresent.isPresent());
        System.out.println("get: " + personOptionalPresent.get());
        personOptionalPresent.ifPresent(person -> System.out.println("ifPresent" + person));
        personOptionalPresent.ifPresentOrElse(
            person -> System.out.println("ifPresentOrElse: " + person),
            () -> System.out.println("Person not found!")
        );
    }

    public record Person(Integer id, String firstName, String lastName, String password, Integer age) {}
}
