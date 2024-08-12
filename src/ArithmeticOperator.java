package Day_01;//  Write a program to get an Arithmetic operator as input and show its use with example.
//  by using Switch case...
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+' -> System.out.println("5 + 6 = "+(5+6));
            case '-' -> System.out.println("5 - 6 = "+(5-6));
            case '*' -> System.out.println("5 * 6 = "+(5*6));
            case '%' -> System.out.println("5 % 2 = "+(5%2));
            case '/' -> System.out.println("5 / 2 = "+(5/2));
            default -> System.out.println("INVALID ARITHMETIC  OPERATOR!!!");
        }
        sc.close();
    }
}
