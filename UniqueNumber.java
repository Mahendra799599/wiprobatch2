import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        String numStr = Integer.toString(num);
        Set<Character> set = new HashSet<>();
        
        // Check if the number is unique
        boolean isUnique = true;
        for (char digit : numStr.toCharArray()) {
            if (!set.add(digit)) {
                isUnique = false;
                break;
            }
        }
        
        // Print the result
        if (isUnique) {
            System.out.println("The number is unique.");
        } else {
            System.out.println("The number is not unique.");
        }
    }
}