package whileloopexercises;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a base number: ");
        int baseNumber = validateInt(scanner);
        int result = sumNumbers(baseNumber, scanner);

        System.out.println("Base number is: " + baseNumber);
        System.out.println("Sum of numbers is: " + result);

        scanner.close();

    }

    static int validateInt(Scanner scanner) {
        boolean isValidInput = false;
        int num = 0;

        // validate user input
        while (!isValidInput) {

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Error: Please enter a positive whole number.");
                }
            } else {
                System.out.println("Error: Please enter a valid whole number.");
                scanner.nextLine(); // Clear input
            }
        }
        return num;
    }

    static int sumNumbers(int baseNumber, Scanner scanner) {
        int sum = 0;

        while (true) {
            System.out.println("Please enter the next number.");
            // validate next number input
            int nextNumber = validateInt(scanner);

            if (sum + nextNumber >= baseNumber) {
                sum += nextNumber;
                break;
            }
            sum += nextNumber;
        }

        return sum;
    }
}
