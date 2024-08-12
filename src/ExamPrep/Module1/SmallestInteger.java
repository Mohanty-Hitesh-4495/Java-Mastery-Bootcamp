package ExamPrep.Module1;
import java.util.Scanner;

// Write a Java program to find the smallest integer in a given matrix.
public class SmallestInteger {
    public static void main(String[] args) {
        int r, c;
        System.out.println("ENTER THE NUMBER OF ROW IN MATRIX:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMN IN MATRIX:");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        int small = Integer.MAX_VALUE;
        System.out.println("ENTER THE VALUES TO THE MATRIX :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]<small)
                    small=arr[i][j];
            }
        }
        System.out.println("Smallest Integer = "+small);
        sc.close();
    }
}
