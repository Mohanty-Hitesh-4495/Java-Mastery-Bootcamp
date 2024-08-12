package Array;
import java.util.*;
class Demo_matrix {
    public static void main(String[] args) {
    int r,c;
    Scanner ac=new Scanner(System.in);
    System.out.println("ENTER THE NO. OF ROWS OF MATRIX = ");
    r=ac.nextInt();
    System.out.println("ENTER THE NO. OF COLUMNS OF MATRIX = ");
    c=ac.nextInt();
    int[][] Arr=new int[r][c];
    System.out.println("NOW ENTER THE ELEMENTS TO THE ("+r+"x"+c+") MATRIX(row wise): ");
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
    ac.close();
    }    
}


