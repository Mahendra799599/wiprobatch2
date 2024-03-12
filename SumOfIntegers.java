import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integer values separated by spaces:");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Error: Non-integer value detected.");
                scanner.next(); // Discard non-integer input
            }
        }

        System.out.println("Total sum: " + sum);

        scanner.close();
    }
}