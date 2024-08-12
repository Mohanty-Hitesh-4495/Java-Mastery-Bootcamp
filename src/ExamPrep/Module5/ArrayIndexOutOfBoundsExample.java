package ExamPrep.Module5;

// Write an example program to handle ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            // Accessing an element outside the bounds of the array
            int index = 10; // Change this value to test different indices
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array Index Out Of Bounds");
        }
    }
}
