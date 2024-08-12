package Day_01;// Write a program to convert one integer datatype to other primitive datatype.
import java.util.Scanner;

public class ConvertDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("BYTE = "+(byte)num);
        System.out.println("SHORT = "+(short)num);
        System.out.println("LONG = "+(long)num);
        System.out.println("FLOAT = "+(float)num);
        System.out.println("DOUBLE = "+(double)num);
        System.out.println("CHARACTER = "+(char)num);
        if(num!=0)
            System.out.println("BOOLEAN = "+true);
        else
            System.out.println("BOOLEAN = "+false);
    }
}
