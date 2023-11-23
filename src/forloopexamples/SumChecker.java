package forloopexamples;
import java.util.Scanner;

public class SumChecker {
    public static void main(String[] args) {
        //Find the maximum number and check if the sum is equal to the maximum number.
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        while (size < 2 || size > 10) {
            System.out.print("Please enter the size of the array (between 2 and 10): ");

            if (scanner.hasNextInt()) {
                size = scanner.nextInt();

                if (size < 2 || size > 10) {
                    System.out.println("Error: Please enter a valid size between 2 and 10.");
                }
            } else {
                System.out.println("Error: Please enter a valid size between 2 and 10.");
                scanner.next(); // Clear the non-integer input
            }
        }

        System.out.println("You've entered a valid array size: " + size);

        for (int i = 0; i < size; i++) {
            boolean isValidInput = false;

            // validate use input
            while (!isValidInput) {
                System.out.print("Enter element " + (i + 1) + ": ");

                if (scanner.hasNextInt()) {
                    int currentNum  = scanner.nextInt();
                    isValidInput = true;

                    sum += currentNum;
                    if (currentNum > maxNum) {
                        maxNum = currentNum;
                    }
                } else {
                    System.out.println("Error: Please enter a valid whole number (between 0 and 2147483647).");
                    scanner.next(); // Clear the non-integer input
                }
            }
        }

        System.out.println("Maximum number in the array:" + maxNum);
        int sumNumsWithoutMax = sum - maxNum;

        if (sumNumsWithoutMax == maxNum) {
            System.out.println("The sum is equal to the maximum number.");
        } else {
            int diff = Math.abs(maxNum - sumNumsWithoutMax);
            System.out.println("The sum is not equal to the maximum number. Difference between the sum and the max number is:" + diff);
        }
        scanner.close();
    }

}
