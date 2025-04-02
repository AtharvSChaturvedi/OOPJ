import java.util.Scanner;

class Account {
    protected long acc_no;
    protected double balance;

    public void input(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        acc_no = scanner.nextLong();
        System.out.print("Enter Balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    private String name;
    private long aadhar_no;

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        scanner.nextLine();
	System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = scanner.nextLong();
    }

    @Override
    public void disp() {
        System.out.println("\n----- Person Details -----");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(scanner);
        }

        System.out.println("\n--- Details of All Persons ---");
        for (Person p : persons) {
            p.disp();
        }

        scanner.close();
    }
}

