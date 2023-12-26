package nestedloops;

import java.util.Scanner;

public class EqualEvenOddPositionSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers and validate them
        System.out.println("Please enter two six-digit integers in the range of 100,000 to 300,000 from the console.");
        System.out.println("The first number entered should always be less than the second.");

        System.out.println("Please enter the first number: ");
        int firstNumber = validateInt(scanner);

        System.out.println("Please enter the second number: ");
        int secondNumber = validateSecondInt(scanner, firstNumber);

        // Print message before calling the method
        System.out.println("The following numbers have equal even and odd position sums.");
        calculateEqualEvenOddSum(firstNumber, secondNumber);

        scanner.close();
    }


    // Validate first number
    static int validateInt(Scanner scanner) {
        boolean isValidInput = false;
        int num = 0;

        // Validate user input
        while (!isValidInput) {
            String msg = "Error: Please enter a positive whole number bigger or equal to 100,000 or smaller to 300,000.";

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num >= 100000 && num <= 300000) {
                    isValidInput = true;
                } else {
                    System.out.println("Error: Please enter a positive whole number.");
                }
            } else {
                System.out.println(msg);
                scanner.nextLine(); // Clear the newline character
            }
        }
        return num;
    }


    // Validate second number
    static int validateSecondInt(Scanner scanner, int firstNumber) {
        int num;

        // Validate user input for the second number
        while (true) {
            String msg = "Error: Please enter a positive whole number bigger than " + firstNumber + ".";

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num > firstNumber && num <= 300000) {
                    break;
                } else {
                    System.out.println(msg);
                }
            } else {
                System.out.println(msg);
                scanner.next(); // Clear the newline character
            }
        }
        return num;
    }


    static void calculateEqualEvenOddSum(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.println(i);
            }
        }
    }
}
