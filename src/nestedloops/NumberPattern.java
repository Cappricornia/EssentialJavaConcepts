package nestedloops;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = validateInt(scanner);
        numberPatternPrint(n);

        scanner.close();
    }

    static int validateInt(Scanner scanner) {
        boolean isValidInput = false;
        int value = 0;

        // Validate user input
        while (!isValidInput) {

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();

                if (value > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Error: Please enter a positive whole number.");
                }
            } else {
                System.out.println("Error: Please enter a positive whole number.");
                scanner.nextLine(); // Clear the newline character
            }
        }
        return value;
    }

    static void numberPatternPrint(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }

}
