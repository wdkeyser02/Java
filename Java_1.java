import java.util.concurrent.TimeUnit;

public class Java_1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        System.out.println("\n\nJAVA - primitive data types in Java");
        System.out.println("Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).");
        System.out.println("Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.");
        System.out.println("A primitive type always has a value, while non-primitive types can be null.");
        System.out.println("A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.");
        System.out.println("Primitives are much faster and use less memory");
        System.out.println("\nJAVA - primitive data types in Java");
        
            // 1 byte / -128 to 127
        byte myByte = 12;
        // myByte.
        System.out.println("myByte = " + myByte);

            // 2 bytes / -32.768 to 32.767
        short myShort = 12;
        // myShort.
        System.out.println("myShort = " + myShort);

            // 4 bytes / -2.147.183.648 to 2.147.483.647
        int myInt = 12;
        System.out.println("myInt = " + myInt);
        
            // 8 bytes / -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
        long myLong = 12; // 12 or 12l or 12L
        System.out.println("myLong = " + myLong);

            // 4 bytes / 6 decimal digits
        float myFloat = 12f; // 12f or 12F
        System.out.println("myFloat = " + myFloat);

            // 8 bytes / 15 decimal digits 
        double myDouble = 12; // 12 or 12d or 12D
        System.out.println("myDouble = " + myDouble);
        
            // 1 bit / true or false
        boolean myBoolean = true; // true or false
        System.out.println("myBoolean = " + myBoolean);

            // 2 bytes / single character
        char myChar = 65; // 65 or 'A'
        System.out.println("myChar = " + myChar + " - The ASCII code: " + (int)myChar);

        // Speed tests.

        System.out.println("\nSpeed test.");
        
        int myTestInt = 0;
        Integer mytestInteger = 0;
        int COUNTER = 2147483647;

        // Speed test int - Integer.

        long start = System.nanoTime();
        for(int x = 0; x < COUNTER; x++) {
            myTestInt += x;
        }
        long stop = System.nanoTime();
        for(Integer x = 0; x < COUNTER; x++) {
            mytestInteger += x;
        }
        long end = System.nanoTime();
        long intTime = TimeUnit.NANOSECONDS.toMillis(stop - start);
        long integerTime = TimeUnit.NANOSECONDS.toMillis(end - stop);
        System.out.println("Time int: " + intTime + " ms");
        System.out.println("Time Integer: " + integerTime + " ms");
        System.out.println("\n");

        // Speed test long - Long.

        long myTestlong = 0;
        Long myTestLong = 0L;

        start = System.nanoTime();
        for(long x = 0L; x < COUNTER; x++) {
            myTestlong += x;
        }
        stop = System.nanoTime();
        for(Long x = 0L; x < COUNTER; x++) {
            myTestLong += x;
        }
        end = System.nanoTime();
        long longTime = TimeUnit.NANOSECONDS.toMillis(stop - start);
        long LongTime = TimeUnit.NANOSECONDS.toMillis(end - stop);
        System.out.println("Time long: " + longTime + " ms");
        System.out.println("Time Long: " + LongTime + " ms");
        System.out.println("\n\n");

        int intTemp = 0;
        //intTemp.

        Integer integerTemp = 0;
        //integerTemp.

    }
}
