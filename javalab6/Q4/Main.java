import java.util.Scanner;

// User-defined exception for invalid hour
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

// User-defined exception for invalid minute
class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

// User-defined exception for invalid second
class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

public class Main {
    // Method to take time input and validate it
    public void setTime(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("InvalidHourException: hour is not between 0 and 24");
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("InvalidMinuteException: minute is not between 0 and 60");
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("InvalidSecondException: second is not between 0 and 60");
        }
        
        System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main time = new Main();

        try {
            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = scanner.nextInt();

            // Calling method to set time
            time.setTime(hours, minutes, seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        scanner.close();
    }
}

