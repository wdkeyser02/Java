public class JavaMyFunctionalInterface_1 {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {

            @Override
            public void myMethod() {
                System.out.println("Run MyMethod!");
                
            }
            
        };

        runMethod(myFunctionalInterface);
    }

    private static void runMethod(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.myMethod();
    }
}
