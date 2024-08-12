package ExamPrep.Module1;
import java.util.Scanner;
/*
    Write a Java program that takes a character as input and determines whether
    it is a vowel, a consonant or any other character.
 */
public class CharacterType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = Character.toLowerCase(scanner.next().charAt(0));

        if (Character.isLetter(inputChar)) {
            if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                System.out.println("The character entered is a vowel.");
            } else {
                System.out.println("The character entered is a consonant.");
            }
        } else {
            System.out.println("The character entered is not a letter.");
        }
        scanner.close();
    }
}

