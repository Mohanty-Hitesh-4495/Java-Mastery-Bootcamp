package Array;
import java.util.*;

// Write a Java program that transposes a given matrix.

public class Transpose_matrix {
    public static void main(String[] args) {
        int r,c;
        Scanner ac=new Scanner(System.in);
        System.out.print("ENTER THE NO. OF ROWS OF MATRIX = ");
        r=ac.nextInt();
        System.out.print("ENTER THE NO. OF COLUMNS OF MATRIX = ");
        c=ac.nextInt();
        int[][] Arr=new int[r][c];
        System.out.println("NOW ENTER THE ELEMENTS TO THE ("+r+"x"+c+") MATRIX: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Arr[i][j]=ac.nextInt();
            }
        }
        System.out.println("DISPLAYING THE MATRIX...");
        for(int[] row:Arr){//row is an array for matrix Arr[][]...
            for(int e:row){//e is the element of every row...
               System.out.print(e+" ");
            }
            System.out.println();
        }
        int [][]A=new int [r][c];
        System.out.println("TRANSPOSE OF MATRIX...");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[j][i]=Arr[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        ac.close();
        }    
    }
    

