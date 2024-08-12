package ExamPrep.Module1;

// Write a Java program that takes an array of integers as command line arguments and prints the sum and average.

public class SumAvg {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int sum=0;
        for(int i=0;i<args.length;i++){
            try {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            } catch (NumberFormatException e) {
                System.out.println("Error: One or more arguments are not integers.");
                return;
            }
        }
        double average = (double) sum / args.length;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
