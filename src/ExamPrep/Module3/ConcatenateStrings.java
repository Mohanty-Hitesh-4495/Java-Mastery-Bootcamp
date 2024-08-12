package ExamPrep.Module3;

// Write a Java program to concatenate two strings using StringBuffer class.

public class ConcatenateStrings {
    public static void main(String[] args) {
        String str1 = "Hi, ";
        String str2 = "Babes!";

        // Concatenating strings using StringBuffer
        String concatenatedString = concatenateStrings(str1, str2);

        // Displaying the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }

    // Method to concatenate strings using StringBuffer
    public static String concatenateStrings(String str1, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str1);
        stringBuffer.append(str2);

        // Convert the StringBuffer back to a string and return it
        return stringBuffer.toString();
    }
}
