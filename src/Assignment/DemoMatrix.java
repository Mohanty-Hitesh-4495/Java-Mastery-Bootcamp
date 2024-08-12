package Assignment;
import java.util.Scanner;
class Unique {
    static boolean distinctMatrix(int[][] arr,int r,int c){
        int size=r*c;
        int cr=0;
        int []A=new int[size];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                A[cr]=arr[i][j];
            cr++;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=1;j<i;j++){
                if(A[i]==A[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
public class DemoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("ENTER THE NUMBER OF ROW IN MATRIX = ");
        r=sc.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMN IN MATRIX = ");
        c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("ENTER THE ELEMENT TO THE ARRAY= ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTERED MATRIX IS...");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean check=Unique.distinctMatrix(arr,r,c);
        if (!check)
            System.out.println("ENTERED MATRIX IS NOT UNIQUE...");
        else
            System.out.println("ENTERED MATRIX IS  UNIQUE...");
    }
}