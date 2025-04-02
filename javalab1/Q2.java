public class Q2 {
    public static void main(String[] args) {
        int mark = 85;
        String grade;

        if (mark >= 90 && mark<=100) {
            grade = "O";
        } else if (mark >= 80 && mark<90) {
            grade = "E";
        } else if (mark >= 70 && mark<80) {
            grade = "A";
        } else if (mark >= 60 && mark<70) {
            grade = "B";
        } else if (mark >= 50 && mark<60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
    }
}
