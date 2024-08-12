import java.util.Scanner;

// Write a program to find the smallest number in the array...

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROW: ");
        int row=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMN: ");
        int column=sc.nextInt();
        int[][] arr=new int[row][column];

        System.out.println("ENTER THE ELEMENTS TO THE ARRAY:");

        System.out.println("SMALLEST NUMBER IN ARRAY: "+smallestElement(arr));
    }
    static int smallestElement(int[][] arr){
        int smallest=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        return smallest;
    }
}
