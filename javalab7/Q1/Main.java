import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str1 = scanner.nextLine();
        System.out.println("The string after changing the case is: " + toggleCase(str1));

        System.out.println("The string after reversing is: " + new StringBuilder(str1).reverse());

        System.out.print("Enter the second string for comparison: ");
        String str2 = scanner.nextLine();
        int diff = calculateDifference(str1, str2);
        System.out.println("The absolute difference between ASCII values is: " + diff);

        System.out.print("Enter the string to be inserted into first string: ");
        String insertStr = scanner.nextLine();
        System.out.println("The string after insertion is: " + str1 + " " + insertStr);

	System.out.print("Enter a string for two different cases: ");
	String strcase = scanner.nextLine();
        System.out.println("Uppercase: " + strcase.toUpperCase());
        System.out.println("Lowercase: " + strcase.toLowerCase());

        System.out.print("Enter a character to search: ");
        char ch = scanner.next().charAt(0);
        CharacterPosition(str1, ch);

        scanner.nextLine();

        System.out.print("Enter a new string for palindrome test: ");
        String palindromeStr = scanner.nextLine();
        System.out.println("Entered string is " + (isPalindrome(palindromeStr) ? "a palindrome" : "not a palindrome"));

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        countWordsVowelsConsonants(sentence);

        scanner.close();
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }

    public static void CharacterPosition(String str, char ch) {
        boolean found = false;
        System.out.print("Positions of entered character: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.print((i+1) + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Entered character is not present");
        } else {
            System.out.println();
        }
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversed);
    }

    public static int calculateDifference(String str1, String str2) {
        return Math.abs(str1.compareTo(str2));
    }

    public static void countWordsVowelsConsonants(String str) {
        int wordCount = str.split("\\s+").length;
        int vowelCount = 0, consonantCount = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.replaceAll("\\s", "").toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);
    }
}

