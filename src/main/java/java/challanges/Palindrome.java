package java.challanges;

public class Palindrome {

    public static boolean isPalindromeNumber(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored /= 10;
        }
        return number == reverse;
    }

    public static void isPalindromeText(String text) {
        StringBuilder reverse = new StringBuilder();
        int length = text.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse.append(text.charAt(i));
        }
        if (reverse.toString().equals(text)) {
            System.out.println("The " + text + " is palindrome.");
        } else {
            System.out.println("The " + text + " is not palindrome.");
        }
    }
}
