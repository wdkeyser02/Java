public class Java_2 {
    public static void main(String[] args) {
        
        System.out.println("JAVA - data types in Java.\n");
        
            // 1 byte / -128 to 127
        Byte myByte = 12;
        System.out.println("myByte = " + myByte);
        System.out.println("Type: " + Byte.TYPE);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Size: " + Byte.SIZE);
        System.out.println("Max value: " + Byte.MAX_VALUE);
        System.out.println("Min value: " + Byte.MIN_VALUE);
        System.out.println("\n");

            // 2 bytes / -32.768 to 32.767
        Short myShort = 12;
        System.out.println("myShort = " + myShort);
        System.out.println("Type: " + Short.TYPE);
        System.out.println("Bytes: " + Short.BYTES);
        System.out.println("Size: " + Short.SIZE);
        System.out.println("Max value: " + Short.MAX_VALUE);
        System.out.println("Min value: " + Short.MIN_VALUE);
        System.out.println("\n");

            // 4 bytes / -2.147.183.648 to 2.147.483.647
        Integer myInt = 12;
        System.out.println("myInt = " + myInt);
        System.out.println("Type: " + Integer.TYPE);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Size: " + Integer.SIZE);
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Min value: " + Integer.MIN_VALUE);
        System.out.println("\n");
        
            // 8 bytes / -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
        Long myLong = 12l;
        System.out.println("myLong = " + myLong);
        System.out.println("Type: " + Long.TYPE);
        System.out.println("Bytes: " + Long.BYTES);
        System.out.println("Size: " + Long.SIZE);
        System.out.println("Max value: " + Long.MAX_VALUE);
        System.out.println("Min value: " + Long.MIN_VALUE);
        System.out.println("\n");

            // 4 bytes / 6 decimal digits
        Float myFloat = 12f;
        System.out.println("myFloat = " + myFloat);
        System.out.println("Type: " + Float.TYPE);
        System.out.println("Bytes: " + Float.BYTES);
        System.out.println("Size: " + Float.SIZE);
        System.out.println("Max value: " + Float.MAX_VALUE);
        System.out.println("Min value: " + Float.MIN_VALUE);
        System.out.println("\n");

            // 8 bytes / 15 decimal digits 
        Double myDouble = 12d;
        System.out.println("myDouble = " + myDouble);
        System.out.println("Type: " + Double.TYPE);
        System.out.println("Bytes: " + Double.BYTES);
        System.out.println("Size: " + Double.SIZE);
        System.out.println("Max value: " + Double.MAX_VALUE);
        System.out.println("Min value: " + Double.MIN_VALUE);
        System.out.println("\n");
        
            // 1 bit / true or false
        Boolean myBoolean = true;
        System.out.println("myBoolean = " + myBoolean);
        System.out.println("Type: " + Boolean.TYPE);
        System.out.println("False value: " + Boolean.FALSE);
        System.out.println("True value: " + Boolean.TRUE);
        System.out.println("\n");
        
            // 2 bytes / single character
        String myString = "f";
        System.out.println("myString = " + myString);
        System.out.println("\n");
        
    }
}
