import java.util.*;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Roll No: ");
            students[i].roll = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            students[i].name = sc.nextLine();
            System.out.print("CGPA: ");
            students[i].cgpa = sc.nextDouble();
        }

        System.out.println("\nStudent Details:");
        double minCgpa = students[0].cgpa;
        String minCgpaName = students[0].name;

        for (Student s : students) {
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", CGPA: " + s.cgpa);
            if (s.cgpa < minCgpa) {
                minCgpa = s.cgpa;
                minCgpaName = s.name;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + minCgpaName);
        sc.close();
    }
}
