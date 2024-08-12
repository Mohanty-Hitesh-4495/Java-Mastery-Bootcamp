package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=0;
       while(f==0) {
           try {
               System.out.print("ENTER A INTEGER VALUE : ");
               int a = sc.nextInt();
               System.out.print("ENTER A DOUBLE VALUE :");
               double b = sc.nextDouble();
               System.out.println("INTEGER VALUE = "+a);
               System.out.println("DOUBLE VALUE = "+b);
               f++;
           }
           catch (InputMismatchException e){
               System.out.println("INVALID INPUT !!! ");
               System.out.println("PLEASE ENTER A VALID INPUT");
               sc.nextLine();
           }
           finally {
           }
       }
    }
}
