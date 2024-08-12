package ExamPrep.Module5;
import java.util.Scanner;

//Write a program that performs division of two integers provided by the user.
//Handle exceptions for division by zero and non-integer inputs

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close(); // Closing the scanner
        }
    }
}

