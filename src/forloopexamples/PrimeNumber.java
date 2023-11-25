package forloopexamples;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = validateInput(scanner);
        boolean prime = checkPrime(number);

        if (prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    static int validateInput(Scanner scanner) {
        boolean isValidInput = false;
        int num = 0;

        // validate user input
        while (!isValidInput) {
            System.out.print("Please enter a whole number: ");

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

    static boolean checkPrime(int num) {
        boolean isPrime = false;

        if (num > 1) {
            isPrime = true;
          // sqrt is there to limit the number of tests to be done, hence to improve the performance
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}

