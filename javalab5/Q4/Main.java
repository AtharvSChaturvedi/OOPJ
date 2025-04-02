interface Employee {
      void getDetails();
}

interface Manager extends Employee {
      void getDeptDetails();
}

class Head implements Manager{
      private int empid;
      private String empName;
      private int deptid;
      private String deptName;
      
      public Head(int empid, String empName, int deptid, String deptName){
            this.empid=empid;
            this.empName=empName;
            this.deptid=deptid;
            this.deptName=deptName;
      }
      
      public void getDetails(){
            System.out.println("Employee Id: "+ empid);
            System.out.println("Employee Name: "+ empName);
      }
      
      public void getDeptDetails(){
            System.out.println("Department Id: "+ deptid);
            System.out.println("Department Name: "+ deptName);
      }
}

public class Main{
      public static void main(String[] args){
            Head head = new Head(123, "Siddharth Ambani", 06, "Marketing");
            
            head.getDetails();
            head.getDeptDetails();
      }
}
