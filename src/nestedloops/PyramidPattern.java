package nestedloops;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter the height of the pyramid
        System.out.print("Please enter the height of the pyramid: ");
        int n = validateInt(scanner);

        buildPyramid(n);

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

    static void buildPyramid(int n) {

        // Loop through each row of the pyramid
        for (int i = 0; i < n; i++) {
            // Print spaces before the *
            //The number of spaces decreases as the row number (i) increases
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // The formula 2 * i + 1 calculates the number of asterisks to print in each row
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

