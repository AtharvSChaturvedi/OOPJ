import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the file name from the user
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        // Call the method to count characters, words, and lines
        countFileStatistics(fileName);

        scanner.close();
    }

    public static void countFileStatistics(String fileName) {
        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++; // Count lines
                charCount += line.length(); // Count characters
                wordCount += line.split("\\s+").length; // Count words
            }

            // Display the results
            System.out.println("No. of characters: " + charCount);
            System.out.println("No. of lines: " + lineCount);
            System.out.println("No. of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

