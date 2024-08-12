package ExamPrep.Module3;
import java.util.Arrays;
import java.util.Scanner;
/*
    Write a Java program to swap the first and last characters of a string using a
    user defined method.
 */
public class SwapFirstLastCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String swappedString = swapFirstLastChars(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String after swapping first and last characters: " + swappedString);
        scanner.close();
    }

    public static String swapFirstLastChars(String str) {
        // Check if the string has at least two characters
        if (str.length() < 2) {
            return str; // Return the string as is if it has less than 2 characters
        }

        char[] charArray = str.toCharArray();
        // Swap the first and last characters
        char temp = charArray[0];
        charArray[0] = charArray[str.length() - 1];
        charArray[str.length() - 1] = temp;

        // Convert the character array back to a string
        return Arrays.toString(charArray);
    }
}
