package ExamPrep.Module1;
import java.util.Scanner;

// Write a Java program that checks whether a given year is a leap year or not.
public class LeapYear {
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year=sc.nextInt();
        if(isLeapYear(year)){
            System.out.println(year+" is a Leap year.");
        }else {
            System.out.println(year+" is not a leap year.");
        }
        sc.close();
    }
}
