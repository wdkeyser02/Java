public class LambdaMyFunctionalInterface_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Run MyMethod!");

        runMethod(myFunctionalInterface);
    }

    private static void runMethod(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.myMethod();
    }
}
