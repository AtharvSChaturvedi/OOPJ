import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student details from user
        System.out.print("Enter Roll No: ");
        String rollNo = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter Marks: ");
        String marks = scanner.nextLine();

        // Getting the file name
        System.out.print("Enter the name of the file to save details: ");
        String fileName = scanner.nextLine();

        // Writing to the file
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(rollNo + ", " + name + ", " + subject + ", " + marks + "\n");
            System.out.println("Student details saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        // Reading from the file
        System.out.println("\nDisplaying file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }

        scanner.close();
    }
}

