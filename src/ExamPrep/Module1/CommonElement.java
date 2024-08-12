package ExamPrep.Module1;
import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to print the common elements present in two different arrays of integers.

public class CommonElement {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter then size of array : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the elements to the first array");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to the second array");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i)
                    result.add(k);
            }
        }
        System.out.println(result);
        sc.close();
    }

}
