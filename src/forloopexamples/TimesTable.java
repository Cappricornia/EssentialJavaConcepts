package forloopexamples;
import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValidNumber = false;
        String errMessage = "Error: Please enter a valid whole number between 1 and 10.\n";

        while (!isValidNumber) {
            System.out.print("Please enter a positive whole number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 10) {
                    isValidNumber = true;
                } else {
                    System.out.println(errMessage);
                }
            } else {
                System.out.println(errMessage);
                scanner.next(); // Clear invalid input
            }
        }
        System.out.println("Here is the times table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
