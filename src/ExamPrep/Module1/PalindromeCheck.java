package ExamPrep.Module1;

// Write a Java program that checks whether a given string, provided as a command line argument, is a palindrome or not.

import java.util.Arrays;

public class PalindromeCheck {

    public static void main(String[] args) {
        String inputString = Arrays.toString(args);
        if (isPalindrome(inputString)) {
            System.out.println("The given string " + inputString + " is a palindrome.");
        } else {
            System.out.println("The given string " + inputString + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
