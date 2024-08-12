package Day_01;// Java OOPs.Program for taking a String input and printing it...
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
