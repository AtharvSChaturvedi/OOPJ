import java.util.Scanner;

// Base class: Plate (2D shape)
class Plate {
    protected double length, width;

    // Constructor for Plate class
    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate: Length = " + length + ", Width = " + width);
    }
}

// Intermediate class: Box (inherits from Plate, adds height)
class Box extends Plate {
    protected double height;

    // Constructor for Box class
    public Box(double length, double width, double height) {
        super(length, width); // Calls Plate constructor
        this.height = height;
        System.out.println("Box: Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

// Derived class: WoodBox (inherits from Box, adds thickness)
class WoodBox extends Box {
    private double thickness;

    // Constructor for WoodBox class
    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height); // Calls Box constructor
        this.thickness = thickness;
        System.out.println("WoodBox: Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thickness);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length, width, height, and thickness: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double thickness = scanner.nextDouble();

        // Creating an object of WoodBox
        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        scanner.close();
    }
}

