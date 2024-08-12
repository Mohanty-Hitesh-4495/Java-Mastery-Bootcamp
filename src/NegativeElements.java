import java.util.*;

// write a java program to display all negative numbers present in a matrix.

public class NegativeElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		System.out.print("ENTER THE SIZE OF ROW :");
		int row = sc.nextInt();
		System.out.print("ENTER THE SIZE OF COULMN :");		
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("ENTER THE ELEMENTS TO THE MATRIX");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]=sc.nextInt();
				if(matrix[i][j]<0)
					arr.add(matrix[i][j]);
			}
		}
		System.out.println("NEGATIVE NUMBERS IN MATRIX : ");
		for(Integer i:arr){
			System.out.print(i+" ");
		}
	}
}