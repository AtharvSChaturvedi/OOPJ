import java.io.*;

public class ReadWrite {
    public static void main(String[] args){
        int ch;
        FileReader fr = null;

        try{
            fr = new FileReader("abc.txt");

            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }

        } catch(FileNotFoundException e){
            System.out.print("ERROR: File not found.");
        } catch(IOException e){
            System.out.print("ERROR: IO Exception.");
        } finally {
            try {
                if (fr != null) fr.close();
            } catch(IOException e) {
                System.out.print("ERROR: Couldn't close the file.");
            }
        }
    }
}
