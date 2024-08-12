package ExamPrep.Module3;
import java.util.Scanner;

// Write a Java program that takes a sentence as input and counts the number of words.

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user to enter a sentence
        System.out.println("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        int wordCount = countWords(inputSentence);

        System.out.println("Number of words in the sentence: " + wordCount);
        scanner.close();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0; // If the sentence is empty, return 0 words
        }

        // Split the sentence by whitespace to count words
        String[] words = sentence.split("\\s+");
        //(or)
        //String[] words = sentence.split(" ");

        return words.length; // Return the number of words
    }
}
