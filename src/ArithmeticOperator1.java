package Day_01;//  Write a program to get an Arithmetic operator as input and show its use with example.
//  using ladder if else...
import java.util.Scanner;

public class ArithmeticOperator1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char operator=sc.next().charAt(0);
        if(operator == '+'){
            System.out.println("5 + 6 = "+(5+6));
        } else if (operator == '-') {
            System.out.println("5 - 6 = "+(5-6));
        } else if (operator == '*'){
            System.out.println("5 * 6 = "+(5*6));
        } else if (operator == '/') {
            System.out.println("5 / 2 = "+(5/2));
        } else if (operator == '%') {
            System.out.println("5 % 2 = "+(5%2));
        }else {
            System.out.println("INVALID ARITHMETIC  OPERATOR!!!");
        }

    }
}
