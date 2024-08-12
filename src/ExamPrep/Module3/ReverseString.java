package ExamPrep.Module3;
import java.util.Scanner;

// Write a Java program that takes a string as input and uses StringBuffer to reverse it.

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string using StringBuffer
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }

    // Method to reverse a string using StringBuffer
    public static String reverseString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
