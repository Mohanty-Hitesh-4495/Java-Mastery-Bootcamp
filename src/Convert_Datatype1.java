package Day_01;//  Write a program to convert a boolean datatype into other primitive datatype.
import java.util.Scanner;

public class Convert_Datatype1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean yn=sc.nextBoolean();
        byte byteValue = (byte)(yn?1:0);
        System.out.println("BYTE = "+byteValue);
        short num2 = (short)(yn?1:0);
        System.out.println("SHORT = "+num2);
        int num3 = yn?1:0;
        System.out.println("INTEGER = "+num3);
        float num4 = yn?1:0;
        System.out.println("FLOAT = "+num4);
        double num5 = yn?1:0;
        System.out.println("DOUBLE = "+num5);
        char ch = (yn?'1':'0');
        System.out.println("CHARACTER = "+ch);
    }
}
