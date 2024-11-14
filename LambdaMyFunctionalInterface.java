public class LambdaMyFunctionalInterface {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Run MyMethod!");
 
        myFunctionalInterface.myMethod();
    }
}
