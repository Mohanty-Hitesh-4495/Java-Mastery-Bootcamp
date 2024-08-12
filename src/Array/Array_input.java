package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array_input {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY =");
    int size=A.nextInt();
    int sum=0;
    float avg;
    int [] Arr=new int[size];
    System.out.println("ENTER "+size+" INTEGERS ONE BY ONE = ");
    for(int i=0;i<Arr.length;i++)
        Arr[i]=A.nextInt();
    System.out.print("ENTERED LIST OF ARRAY =");
    System.out.println(Arrays.toString(Arr));
    System.out.print("SUM OF ALL INTEGERS IN ARRAY =");
    for(int i=0;i<Arr.length;i++)
        sum=sum+Arr[i]; 
    avg=(float)sum/size;
    System.out.println(" "+sum);
    System.out.println("AVERAGE OF ALL INTEGERS IN ARRAY = "+avg);
A.close();
}

}
