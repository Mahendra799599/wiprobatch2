import java.util.Scanner;

  public class TomAndJerry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();

        if (number >= 20 && number <= 30) {
            if (number % 2 == 0) {
                System.out.println("Jerry");}
                else {
                System.out.println("Tom");}}
       
    }
}
