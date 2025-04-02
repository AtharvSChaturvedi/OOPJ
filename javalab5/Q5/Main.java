import General.Employee;
import Marketing.Sales;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Employee Details
        System.out.print("Enter the employee id and employee name: ");
        int empid = scanner.nextInt();
        String ename = scanner.next();
        
        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        // Create Sales Employee
        Sales salesPerson = new Sales(empid, ename, basic);

        // Calculate earnings
        double totalEarnings = salesPerson.earnings();
        double travelAllowance = salesPerson.tallowance();

        // Output Results
        System.out.println("The emp id of the employee is " + salesPerson.getEmpid());
        System.out.println("The total earning is " + totalEarnings);

        scanner.close();
    }
}

