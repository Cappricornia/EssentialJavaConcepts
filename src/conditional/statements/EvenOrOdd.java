package conditional.statements;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a whole number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("The number " + number + " is odd.");
            }
        } else {
            System.out.println("Invalid input. Please enter a whole number without decimal points.");
        }

        scanner.close();
    }
}



