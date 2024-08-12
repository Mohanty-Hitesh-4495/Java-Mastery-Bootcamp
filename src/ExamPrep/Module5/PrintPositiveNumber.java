package ExamPrep.Module5;
import java.util.Scanner;

// Write a java program that prints an input integer with custom exception for a negative number or 0.

class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException(String message) {
        super(message);
    }
}

public class PrintPositiveNumber {
    // Method to print positive number or throw exception for non-positive input
    public static void printPositiveNumber(int number) throws NonPositiveNumberException {
        if (number <= 0) {
            throw new NonPositiveNumberException("Input number must be positive and non-zero.");
        } else {
            System.out.println("Input Number: " + number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number :");
        int inputNumber=sc.nextInt();
        try {
            printPositiveNumber(inputNumber);
        } catch (NonPositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
