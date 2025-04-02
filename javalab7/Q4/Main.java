import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Specify the binary files to compare
        String file1 = "file1.txt";  // Change this to actual file name
        String file2 = "file2.txt";  // Change this to actual file name

        compareBinaryFiles(file1, file2);
    }

    public static void compareBinaryFiles(String file1, String file2) {
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {
            
            int byte1, byte2;
            int position = 1; // Byte positions start from 1

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();

                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which they differ is " + position);
                    return;
                }

                if (byte1 == -1) {  // End of both files
                    System.out.println("Two files are equal");
                    return;
                }

                position++;
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}

