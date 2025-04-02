public class Q4 {
    public static void main(String[] args) {
        int num = 121;
        int ogNum = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (ogNum == reverse) {
            System.out.println("The number " + ogNum + " is a Palindrome.");
        } else {
            System.out.println("The number " + ogNum + " is not a Palindrome.");
        }
    }
}

