package ExamPrep.Module1;
import java.util.Scanner;

// Java program that takes an array of integers as input and finds the greatest among them using a user-defined method.

public class GreatestInArray {

    public static int findGreatest(int[] arr) {
        int greatest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int greatest = findGreatest(numbers);
        System.out.println("The greatest number in the array is: " + greatest);
        scanner.close();
    }
}
