package Assignment;
import java.util.*;
/*
    Write a Java program that acts as a simple calculator. Implement basic
    arithmetic operations (addition, subtraction, multiplication, division) and use
    decision-making structures to handle user input and perform the
    corresponding calculations.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1,num2;int opt;
        do{
            System.out.println("***** AVAILABLE OPERATIONS *****");
            System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS\n6.EXIT");
            System.out.print("ENTER YOUR CHOICE= ");
            opt=sc.nextInt();
            System.out.print("ENTER THE FIRST NUMBER= ");
            num1=sc.nextFloat();
            System.out.print("ENTER THE SECOND NUMBER= ");
            num2=sc.nextFloat();
            switch (opt) {
                case 1 -> System.out.println("ADDITION OF " + num1 + " AND " + num2 + "= " + num1 + num2);
                case 2 -> System.out.println("SUBTRACTION OF " + num1 + " AND " + num2 + "= " + (num1 - num2));
                case 3 -> System.out.println("MULTIPLICATION OF " + num1 + " AND " + num2 + "= " + (num1 * num2));
                case 4 -> System.out.println("DIVISION OF " + num1 + " AND " + num2 + "= " + (num1 / num2));
                case 5 -> System.out.println("MODULUS OF " + num1 + " AND " + num2 + "= " + (num1 % num2));
                case 6 -> System.out.println("EXITING FROM THE CALCULATOR...");
                default -> System.out.println("ENTER THE VALID CHOICE...");
            }
        }while(opt!=6);
    }
}
