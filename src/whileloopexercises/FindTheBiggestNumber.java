package whileloopexercises;

import java.util.Scanner;

public class FindTheBiggestNumber {
    private static int maxValue;
    private static boolean numberEntered = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        maxValue = Integer.MIN_VALUE;


        while (true) {
            System.out.print("Enter a number or 'Stop' to end: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Stop")) {
                break;
            }

            int intInput = validateNumber(input);
            findMaxNum(intInput);

        }
        if (numberEntered) {
            String resultMsg = "The biggest number is " + maxValue;
            System.out.println(resultMsg);
        } else {
            // if the user enters stop before any number
            System.out.println("No valid number entered.");
        }

        scanner.close();
    }

    static int validateNumber(String input) {
        int num = 0;

        try {
            num = Integer.parseInt(input);
            numberEntered = true; //  valid number is entered
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        }

        return num;
    }

    static void findMaxNum(int num) {
        if (num > maxValue) {
            maxValue = num;
        }
    }
}
