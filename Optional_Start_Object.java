import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional_Start_Object {
    public static void main(String[] args) {
        System.out.println("\nJAVA Optionals\n"); 

        Optional<Person> personEmpty = Optional.empty();
        Optional<Person> personPresent = Optional.of(new Person(1, "Bill", "Gates", "password", 56));
        Optional<Person> personNullableEmpty = Optional.ofNullable(null);
        Optional<Person> personNullablePresent = Optional.ofNullable(new Person(1, "Bill", "Gates", "password", 56));
        Optional<Person> personFindElementEmpty = findPerson(listOfPerson(), "");
        Optional<Person> personFindElementPresent = findPerson(listOfPerson(), "Bill");
        System.out.println("Optional Empty: " + personEmpty + " - Is Empty:" + personEmpty.isEmpty() + " - Is Present:" + personEmpty.isPresent());
        System.out.println("Optional Present: " + personPresent + " - Is Empty:" + personPresent.isEmpty() + " - Is Present:" + personPresent.isPresent());
        System.out.println("Optional Nullable Empty: " + personNullableEmpty + " - Is Empty:" + personNullableEmpty.isEmpty() + " - Is Present:" + personNullableEmpty.isPresent());
        System.out.println("Optional Nullable Present: " + personNullablePresent + " - Is Empty:" + personNullablePresent.isEmpty() + " - Is Present:" + personNullablePresent.isPresent());
        System.out.println("Optional Find Element Empty: " + personFindElementEmpty + " - Is Empty:" + personFindElementEmpty.isEmpty() + " - Is Present:" + personFindElementEmpty.isPresent());
        System.out.println("Optional Find Element Present: " + personFindElementPresent + " - Is Empty:" + personFindElementPresent.isEmpty() + " - Is Present:" + personFindElementPresent.isPresent());
        System.out.println("\n"); 
    }

    public record Person(Integer id, String firstName, String lastName, String password, Integer age) {}

    public static Optional<Person> findPerson(List<Person> listOfPerson, String name) {
        return listOfPerson.stream().filter(person -> person.firstName == name).findFirst();
    }

    public static List<Person> listOfPerson() {
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person(1, "Bill", "Gates", "password", 56));
        listOfPerson.add(new Person(2, "James", "Ford", "password", 50));
        listOfPerson.add(new Person(3, "Robert", "Gray", "password", 45));
        listOfPerson.add(new Person(4, "Charles", "Adams", "password", 68));
        return listOfPerson;
    }
}
