package Manual;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR CHOICE (1-4) TO DISPLAY SEASON:");
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("SUMMER");
        }else if (choice == 2){
            System.out.println("WINTER");
        }else if (choice == 3) {
            System.out.println("MONSOON");
        }else if (choice == 4) {
            System.out.println("SPRING");
        }else{
            System.out.println("INVALID CHOICE");
        }
    }
}
