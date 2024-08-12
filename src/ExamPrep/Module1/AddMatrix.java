package ExamPrep.Module1;
import java.util.Scanner;
// Write a Java program to perform addition of two matrices.
class AddMatrix {
    public static void Add(int [][] arr1, int [][] arr2){
        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int r,c;
        System.out.println("ENTER THE NUMBER OF ROW IN MATRIX:");
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMN IN MATRIX:");
        c=sc.nextInt();
        int [][] arr1=new int[r][c];
        int [][] arr2=new int[r][c];
        System.out.println("ENTER THE ELEMENTS TO THE FIRST MATRIX:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER THE ELEMENTS TO THE SECOND MATRIX");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        Add(arr1,arr2);
        System.out.println("THE RESULTANT MATRIX IS ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }
    sc.close();
    }
}
