public class Main {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 5;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
	catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
	finally {
            System.out.println("Finally block executed: Cleaning up resources if any.");
        }

        System.out.println("Program continues normally...");
    }
}

