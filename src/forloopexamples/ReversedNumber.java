package forloopexamples;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        Scanner scanner = new Scanner(System.in);
        int validNumber = validateInput(scanner);
        int reversedNumber = reversedNumber(validNumber);

        System.out.println("Original number =>  " + validNumber);
        System.out.println("Reversed number =>  " + reversedNumber);

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

    public static int reversedNumber(int num) {
        int reversed = 0;

        // Iterate through each digit in the number
        //tempNum /= 10 divides the value of tempNum by 10, removing the last digit of the number
        //and moving to the next digit in the next iteration.
        for (int tempNum = num; tempNum > 0; tempNum /= 10) {
            // Extract the last digit of the number
            int remainder = tempNum % 10;

            // Build the reversed number - add the extracted digit to the reversed number
            reversed = reversed * 10 + remainder;
        }
        return reversed;
    }
}


