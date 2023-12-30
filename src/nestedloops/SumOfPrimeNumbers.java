package nestedloops;

import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The use can enter 10 valid numbers, and the program will check if they are prime or not.
        // In case of invalid input, the validateInt method will prompt user to enter a valid number.
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter a positive number: ");
            int number = validateInt(scanner);

            if (primeNumberChecker(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }


    static int validateInt(Scanner scanner) {
        boolean isValidInput = false;
        int number = 0;

        // Validate user input
        while (!isValidInput) {

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive whole number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive whole number.");
                scanner.nextLine(); // Clear the newline character
            }
        }
        return number;
    }


    static boolean primeNumberChecker(int number) {

        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check for divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; //  The number is not prime
            }
        }
        return true;
    }
}
