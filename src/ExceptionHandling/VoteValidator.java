package ExceptionHandling;

import java.util.Scanner;

public class VoteValidator
{
     static void validate(int age){
        if (age < 18)
        {
            throw new ArithmeticException("Age is less than 18");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();
        try
        {
            validate(age);
            System.out.println("Welcome to vote");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Sorry, you are not eligible to vote.");
            System.out.println(e.getMessage());
        }


    }
}