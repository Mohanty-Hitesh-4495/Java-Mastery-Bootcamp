package ExamPrep.Module1;
import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program that separates an array of integers into two arrays
// one for even numbers and another for odd numbers.

public class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        ArrayList<Integer> evenArray = new ArrayList<>(); // Array for even numbers
        ArrayList<Integer> oddArray = new ArrayList<>(); // Array for odd numbers

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            // Separating even and odd numbers
            if (numbers[i] % 2 == 0) {
                evenArray.add(numbers[i]);
            } else {
                oddArray.add(numbers[i]);
            }
        }
        System.out.println("Even numbers: "+ evenArray);
        System.out.println("Odd numbers: "+ oddArray);
        scanner.close();
    }
}
