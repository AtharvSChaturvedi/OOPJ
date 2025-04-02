import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get source and destination file names from the user
        System.out.print("Enter the source file name: ");
        String sourceFile = scanner.nextLine();
        System.out.print("Enter the destination file name: ");
        String destinationFile = scanner.nextLine();

        // Copy using Character Stream
        copyUsingCharacterStream(sourceFile, destinationFile);

        // Copy using Byte Stream
        copyUsingByteStream(sourceFile, destinationFile);

        scanner.close();
    }

    // Method to copy file using Character Stream (FileReader and FileWriter)
    public static void copyUsingCharacterStream(String source, String destination) {
        try (FileReader reader = new FileReader(source);
             FileWriter writer = new FileWriter(destination)) {
            
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            System.out.println("File copied successfully using Character Stream.");
        } catch (IOException e) {
            System.out.println("Error in Character Stream Copy: " + e.getMessage());
        }
    }

    // Method to copy file using Byte Stream (FileInputStream and FileOutputStream)
    public static void copyUsingByteStream(String source, String destination) {
        try (FileInputStream inputStream = new FileInputStream(source);
             FileOutputStream outputStream = new FileOutputStream(destination)) {
            
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            System.out.println("File copied successfully using Byte Stream.");
        } catch (IOException e) {
            System.out.println("Error in Byte Stream Copy: " + e.getMessage());
        }
    }
}

