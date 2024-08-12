package ExamPrep.Module3;
import java.util.Scanner;

//Write a Java program that takes a string as input and counts the total number
//of vowels present, considering both uppercase and lowercase vowels

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text =sc.nextLine();
        char[] arr = text.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i]=Character.toLowerCase(arr[i]);
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    count ++;
                }
            }
        }
        System.out.println("The given string:"+" "+text);
        System.out.println("The number of vowels present in string : " + count);
    }
}
