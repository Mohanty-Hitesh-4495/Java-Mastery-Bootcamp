//Taking input using Scanner Class from java.util package....
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println("ENTER THE FIRST NUMBER:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int b=sc.nextInt();
        //max(a,b,total)
        int total=a+b;
        System.out.println("TOTAL= "+total);
    }
}
