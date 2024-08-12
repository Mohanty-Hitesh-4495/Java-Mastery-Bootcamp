package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoDigits {
    public static void main(String[] args) {
        ArrayList<Integer> odd =new ArrayList<>();
        ArrayList<Integer> even =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ADD NUMBERS TO LIST : ");
        int a=sc.nextInt();
        while(a!=0){
            if((a%10)%2 == 0)
                even.add(a%10);
            else
                odd.add(a%10);
            a/=10;
        }
        System.out.print("EVEN DIGITS LIST : ");
        System.out.println(even);
        System.out.println();
        System.out.print("ODD DIGITS LIST : ");
        System.out.println(odd);
    }
}
