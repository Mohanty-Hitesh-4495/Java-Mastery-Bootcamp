package ExceptionHandling;

import java.util.Scanner;
// write a program to find the factorial of given number with exception handling for negative number
public class Fact_Exception {
    static int fact(int num){
        int factorial=1;
        for(int i=num;i>0;i--){
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.print("ENTER A NUMBER:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        try{
            if(num<0)
                throw new IllegalArgumentException();
            System.out.println(fact(num));
        }catch (IllegalArgumentException e){
            System.out.println("Exception Caught!!!");
            System.out.println(e);
        }
        sc.close();
    }
}
