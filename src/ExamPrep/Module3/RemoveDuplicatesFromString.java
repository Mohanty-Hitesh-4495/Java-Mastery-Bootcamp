package ExamPrep.Module3;

//  Write a Java program that removes duplicate characters from a given string.

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String inputString = "Gandhi Institute For Technology";
        String stringWithoutDuplicates = removeDuplicates(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String without Duplicates: " + stringWithoutDuplicates);
    }

    public static String removeDuplicates(String str) {
        char[] charArray = str.toCharArray();
        // Use a boolean array to keep track of seen characters
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            // If the character is not seen yet, append it to the result and mark it as seen
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }
}

