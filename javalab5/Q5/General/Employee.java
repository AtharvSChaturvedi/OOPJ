package General;

public class Employee {
    protected int empid;
    private String ename;
    protected double basic;

    public Employee(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public double earnings() {
        return basic + (0.80 * basic) + (0.15 * basic);
    }

    public int getEmpid() {
        return empid;
    }
}

