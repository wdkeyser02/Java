import java.util.Optional;

public class Optional_Start_1 {
    public static void main(String[] args) {
        
        System.out.println("JAVA Optionals\n"); 
        
        Optional<Integer> op = Optional.of(9455); 
  
        // print value 
        System.out.println("Optional: " + op); 
  
        // orElse value 
        System.out.println("Value by orElse" + "(100) method: " + op.orElse(100)); 
    }
}
