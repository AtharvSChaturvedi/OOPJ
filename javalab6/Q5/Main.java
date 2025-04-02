// User-defined exception for invalid number of arguments
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        try {
            // Check if the number of arguments is less than 4
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            } else {
                int sumOfSquares = 0;
                
                // Loop through the arguments and calculate the sum of squares
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    sumOfSquares += num * num; // Adding the square of the number
                }

                System.out.println("Sum of squares: " + sumOfSquares);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter only numbers.");
        }
    }
}

