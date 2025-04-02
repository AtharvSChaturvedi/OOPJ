import java.util.Scanner;

// Parent class representing a 2D plastic sheet
class Plastic2D {
    protected double length, width;
    protected final double costPerSqFt = 40; // Cost per square foot

    public Plastic2D(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateCost() {
        return length * width * costPerSqFt;
    }
}

// Child class representing a 3D plastic box, inheriting from 2D
class Plastic3D extends Plastic2D {
    private double height;
    private final double costPerCubicFt = 60; // Cost per cubic foot

    public Plastic3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double calculateCost() {
        return length * width * height * costPerCubicFt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the plastic type: \n1. 2D Sheet\n2. 3D Box");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter length and width of the 2D sheet (in ft): ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            Plastic2D sheet = new Plastic2D(length, width);
            System.out.println("Total Cost: Rs " + sheet.calculateCost());
        } else if (choice == 2) {
            System.out.print("Enter length, width, and height of the 3D box (in ft): ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            Plastic3D box = new Plastic3D(length, width, height);
            System.out.println("Total Cost: Rs " + box.calculateCost());
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

