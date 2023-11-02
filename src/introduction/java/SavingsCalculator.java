package introduction.java;

import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidNumber = false;
        double savings = 0;
        int periodForDeposit = 0;
        double interestRate = 0;

        while (!isValidNumber) {
            System.out.print("Please enter the amount: ");
            if (scanner.hasNextDouble()) {
                savings = scanner.nextDouble();
                isValidNumber = true;
            } else {
                System.out.println("Please enter a valid number for the amount!");
                scanner.next();
            }
        }

        isValidNumber = false;
        while (!isValidNumber) {
            System.out.print("Please enter a period for deposit (in months): ");
            if (scanner.hasNextInt()) {
                periodForDeposit = scanner.nextInt();
                isValidNumber = true;
            } else {
                System.out.println("Please enter a valid period for deposit (in months)!");
                scanner.next();
            }
        }
        isValidNumber = false;

        while (!isValidNumber) {
            System.out.print("Please enter the interest rate: ");
            if (scanner.hasNextDouble()) {
                interestRate = scanner.nextDouble();
                isValidNumber = true;
            } else {
                System.out.println("Please enter a valid number for the interest rate!");
                scanner.next();
            }
        }


        double totalSavings = savings + (periodForDeposit / 12.0) * (savings * (interestRate / 100));
        double accumulatedInterest = totalSavings - savings;
        double roundedInterest = Double.parseDouble(String.format("%.2f", accumulatedInterest));
        System.out.println("The total balance in your savings account after the specified period: " + totalSavings);
        System.out.println("==============================================================================");
        System.out.println("The interest earned on your savings during this period: " + roundedInterest);

        scanner.close();
    }
}
