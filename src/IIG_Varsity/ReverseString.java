package IIG_Varsity;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a String : ");
        String text = sc.nextLine();
        String[] arr = text.split(" ");
        System.out.print(" The Reverse String:" + " ");
        for (String temp : arr) {
            for (int j = temp.length() - 1; j >= 0; j--) {
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
    }
}