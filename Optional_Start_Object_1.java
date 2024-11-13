import java.util.Optional;

public class Optional_Start_Object_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Optionals\n"); 
        
        Optional<Person> personEmpty = Optional.empty(); // or Optional.ofNullable(null)

        System.out.println("NumberEmpty: " + personEmpty);
        System.out.println("isPresent: " + personEmpty.isPresent());
        System.out.println("isEmpty: " + personEmpty.isEmpty());
        System.out.println("or: " + personEmpty.or(() -> Optional.of(new Person(0, "", "", "", 0))));
        System.out.println("orElse: " + personEmpty.orElse(new Person(0, "", "", "", 0)));
        //System.out.println("get: " + personEmpty.get());
        //System.out.println("orElseThrow: " + personEmpty.orElseThrow());

        personEmpty.ifPresent((present) -> System.out.println("ifPresent: " + present));
        personEmpty.ifPresentOrElse(
            number -> System.out.println("ifPresentOrElse: " + number),
            () -> System.out.println("Optional is empty!")
        );

    }

    public record Person(Integer id, String firstName, String lastName, String password, Integer age) {}

    
}
