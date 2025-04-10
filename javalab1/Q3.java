public class Q3 {
    public static void main(String[] args) {
        int dayNo = 10; 
        int firstDayOfMonth = 1; 

        int weekDayNo = (firstDayOfMonth + dayNo - 1) % 7;

        switch (weekDayNo) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
