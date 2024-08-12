package Manual;

import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER : ");
        a = sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER : ");
        b = sc.nextInt();
        int result;
        result = (a>b)?a:b;
        System.out.println("GREATEST NUMBER (INT) : " + result);
        System.out.println("GREATEST NUMBER (FLOAT) :" + (float) result);
        sc.close();
    }
}
