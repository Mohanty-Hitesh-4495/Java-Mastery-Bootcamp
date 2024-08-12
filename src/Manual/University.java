package Manual;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS (0-100) = ");
        marks = sc.nextInt();
        switch (marks/10){
            case 9 -> System.out.println("O GRADE");
            case 8 -> System.out.println("E GRADE");
            case 7 -> System.out.println("A GRADE");
            case 6 -> System.out.println("B GRADE");
            case 5 -> System.out.println("C GRADE");
            case 4 -> System.out.println("D GRADE");
            case 3 -> System.out.println("F GRADE");
            default -> System.out.println("INVALID MARKS :(");
        }
    }
}
