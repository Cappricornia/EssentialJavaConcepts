package forloopexamples;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        // Write a program that prompts the user to input an integer checks if the number is a palindromic number.
        Scanner scanner = new Scanner(System.in);
        int validNumber = validateInput(scanner);
        int reversed = reversedNumber(validNumber);

        if (isPalindromicNumber(validNumber, reversed)) {
            System.out.println("The number " + reversed + " is a palindromic number.");
        } else {
            System.out.println("The number " + validNumber + " is not a palindromic number.");
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

    static int reversedNumber(int num){
        int reversedNumber = 0;

        // Iterate through each digit in the number
        for (int tempNum = num; tempNum > 0; tempNum /= 10) {
            // Extract the last digit of the number
            int remainder = tempNum % 10;

            // add the extracted digit to the reversed number
            reversedNumber = reversedNumber * 10 + remainder;
        }

        return reversedNumber;
    }

    public static boolean isPalindromicNumber(int original, int reversed) {
        return original == reversed;
    }
}
