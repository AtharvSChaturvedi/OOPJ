import java.util.Scanner;

interface Salary{
      double earnings(double basic);
      double deductions(double basic);
      double bonus(double basic);
}

class Manager implements Salary{
      @Override
      public double earnings(double basic){
            return basic + (0.8*basic) + (0.15*basic);
      }
      
      @Override
       public double deductions(double basic){
            return 0.12*basic;
      }
      @Override
      public double bonus(double basic) {
        return 0; // Managers have no bonus by default
    }
}

class Substaff extends Manager{
      @Override
      public double bonus(double basic){
            return 0.5*basic;
      }
}

public class Main{
      public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter Basic Salary: ");
            double basic = scanner.nextDouble();
            
            Substaff substaff = new Substaff();
            double earnings = substaff.earnings(basic);
            double deductions = substaff.deductions(basic);
            double bonus = substaff.bonus(basic);
            
            System.out.println("Earnings: "+earnings);
            System.out.println("Deductions: "+deductions);
            System.out.println("Bonus: "+bonus);
      }
}


