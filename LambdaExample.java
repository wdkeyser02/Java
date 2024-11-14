public class LambdaExample {
    public static void main(String[] args) {
        
        System.out.println("\nJAVA Lambda\n");
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Run MyMethod!");
        MyFunctionalInterface_1 myFunctionalInterface_1 = () -> "Run MyMethod!";
        MyFunctionalInterface_2 myFunctionalInterface_2 = a -> System.out.println("Run MyMethod: " + a);
        
        MyFunctionalInterface_3 myFunctionalInterface_3 = (a, b) -> System.out.println("Run MyMethod: " + (a + b));
        // MyFunctionalInterface_3 myFunctionalInterface_3 = (a, b) -> 
        //                                                    {
        //                                                        Integer sum = a + b;
        //                                                        System.out.println("Run MyMethod: " + sum);
        //                                                    };
        
        
        MyFunctionalInterface_4 myFunctionalInterface_4 = (a, b) -> a + b;
        // MyFunctionalInterface_4 myFunctionalInterface_4 = (a, b) -> 
        //                                                    {
        //                                                        Integer sum = a + b;
        //                                                        return sum;
        //                                                    };

        MyFunctionalInterface_5 myFunctionalInterface_5 = (a, b, c) -> a + b + c;
        // MyFunctionalInterface_5 myFunctionalInterface_5 = (a, b, c) -> 
        //                                                    {
        //                                                        Integer sum = a + b + c;
        //                                                        return sum;
        //                                                    };
        
 
        myFunctionalInterface.myMethod();
        System.out.println(myFunctionalInterface_1.myMethod());
        myFunctionalInterface_2.myMethod(1);
        myFunctionalInterface_3.myMethod(1, 2);
        System.out.println("Sum: " + myFunctionalInterface_4.myMethod(1, 2));
        System.out.println("Sum: " + myFunctionalInterface_5.myMethod(1, 2, 3));
    
    }
}
