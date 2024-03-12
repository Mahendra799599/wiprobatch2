import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Check if palindrome
        String numStr = Integer.toString(num);
        boolean isPalindrome = true;
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");

            // Calculate sum of even digits
            int sumEven = 0;
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                if (digit % 2 == 0) {
                    sumEven += digit;
                }
            }

            if (sumEven > 25) {
                System.out.println("Sum of even digits (" + sumEven + ") is greater than 25.");
            } else {
                System.out.println("Sum of even digits (" + sumEven + ") is not greater than 25.");
            }
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}