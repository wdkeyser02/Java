public class JavaMyFunctionalInterface {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {

            @Override
            public void myMethod() {
                System.out.println("Run MyMethod!");
                
            }
            
        };

        myFunctionalInterface.myMethod();
    }
}
