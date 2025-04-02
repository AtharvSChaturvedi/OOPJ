import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[4]; 
        
        System.out.println("Enter numbers:");
        
        try {
		for (int i = 0; i < 5; i++) { 
			numbers[i] = scanner.nextInt();
            	}
        } 
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        scanner.close();
    }
}

