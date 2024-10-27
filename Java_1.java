import java.util.Random;

public class Java_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJava Optional.\n");

        String myString = myRandomString();
        if (myString != null) {
            System.out.println(myString);
        } else {
            System.out.println("No text!");
        }
        System.out.println("");
    }

    private static String myRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "My Java Tutorials!";
        }
        return null;
    }
}
