package Manual;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER = ");
        int num = sc.nextInt();
        if(num>=0) {
            System.out.println("POSITIVE");
        }
        else {
            System.out.println("NEGATIVE");
        }
    }
}
