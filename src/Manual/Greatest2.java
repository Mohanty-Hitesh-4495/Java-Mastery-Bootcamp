package Manual;

import java.util.Scanner;

public class Greatest2 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("FIRST NUMBER = ");
        num1=sc.nextInt();
        System.out.print("SECOND NUMBER = ");
        num2=sc.nextInt();
        System.out.print("THIRD NUMBER = ");
        num3=sc.nextInt();
        if(num1>num2) {
            if(num1>num3) {
                System.out.println(num1 + " IS GREATEST");
            }
            else {
                System.out.println(num3 + " IS GREATEST");
            }
        }
        else {
            if(num2>num3){
                System.out.println(num2 + " IS GREATEST");
            }
            else {
                System.out.println(num3 + " IS GREATEST");
            }
        }
    }
}
