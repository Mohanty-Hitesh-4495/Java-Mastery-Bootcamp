package ExamPrep.Module4;

//Write a java program to demonstrate unboxing handle converting four different objects to their primitive types.

public class UnboxingExample {
    public static void main(String[] args) {
        // Wrapper class objects
        Integer intObj = Integer.valueOf(20);        // Integer object
        Double doubleObj = Double.valueOf(12.34);   // Double object
        Boolean boolObj = Boolean.valueOf(true);    // Boolean object
        Long longObj = Long.valueOf(1000L);         // Long object

        // Unboxing - Converting wrapper objects to primitive types
        int intValue = intObj.intValue();              // Integer to int
        double doubleValue = doubleObj.doubleValue();  // Double to double
        boolean boolValue = boolObj.booleanValue();    // Boolean to boolean
        long longValue = longObj.longValue();          // Long to long

        // Display the primitive values
        System.out.println("Unboxed int value: " + intValue);
        System.out.println("Unboxed double value: " + doubleValue);
        System.out.println("Unboxed boolean value: " + boolValue);
        System.out.println("Unboxed long value: " + longValue);
    }
}
