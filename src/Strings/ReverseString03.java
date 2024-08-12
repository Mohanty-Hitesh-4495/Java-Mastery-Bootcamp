package Strings;

public class ReverseString03{
    public static void main(String[] args) {
        for (String arg : args) System.out.println("Enter a String : " + arg);
        System.out.print("The Reverse String:"+" ");
        for (String temp : args) {
            for (int j = temp.length() - 1; j >= 0; j--) {
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
