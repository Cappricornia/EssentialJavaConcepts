package forloopexamples;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidNumber = false;
        int n = 0;

        // Validate that N is a positive int
        while (!isValidNumber) {
            System.out.print("Please enter the number of elements (N): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();

                if (n > 0) {
                    isValidNumber = true;
                } else {
                    System.out.println("Error: Please enter a positive whole number for N.");
                }
            } else {
                System.out.println("Error: Please enter a valid whole number for N.");
                scanner.next(); // Clear invalid input
            }
        }

        int maxNumber = Integer.MIN_VALUE;

        // find max number
        for (int i = 1; i <= n; i++) {
            System.out.print("Please enter number " + i + ": ");
            while (true) {
                if (scanner.hasNextInt()) {
                    int currentNumber = scanner.nextInt();
                    if (currentNumber >= 0) {
                        // Override maxNumber if the current number is greater
                        if (currentNumber > maxNumber) {
                            maxNumber = currentNumber;
                        }
                        break; // Exit the loop if a valid number is entered
                    } else {
                        System.out.println("Error: Please enter a positive whole number.");
                        scanner.next(); // Clear invalid input
                    }
                } else {
                    System.out.println("Error: Please enter a valid whole number.");
                    scanner.next(); //  Clear invalid input
                }
            }
        }

        System.out.println("The maximum number is: " + maxNumber);

        scanner.close();
    }
}