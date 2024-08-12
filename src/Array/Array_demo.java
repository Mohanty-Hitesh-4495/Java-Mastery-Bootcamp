package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array_demo {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY =");
    int size=A.nextInt();
    int [] Arr=new int[size];
    System.out.println("ENTER "+size+"INTEGERS ONE BY ONE = ");
    for(int i=0;i<Arr.length;i++)
        Arr[i]=A.nextInt();
    System.out.print("ENTERED LIST OF ARRAY =");
//  for(int j=0;j<Arr.length;j++)
//      System.out.print(" "+Arr[j]);
    System.out.println(Arrays.toString(Arr));
    A.close();    
    } 
}
