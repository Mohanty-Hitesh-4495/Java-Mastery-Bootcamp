package ExamPrep.Module5;

// Write a Java program that defines a method that can potentially throw an exception in Java

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Calling a method that can potentially throw an exception
            performOperation(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that can potentially throw an exception
    public static void performOperation(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int result = a / b;
        System.out.println("Result of division: " + result);
    }
}

