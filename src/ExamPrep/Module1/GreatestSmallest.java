package ExamPrep.Module1;
import java.util.Scanner;

// Write a java program to print the greatest and smallest of N integers.

public class GreatestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if(numbers[i]>greatest)
                greatest=numbers[i];
            if(numbers[i]<smallest)
                smallest=numbers[i];
        }
        System.out.println("The greatest number is: " + greatest);
        System.out.println("The smallest number is: " + smallest);
        scanner.close();
    }
}
