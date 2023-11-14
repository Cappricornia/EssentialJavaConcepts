package nested.conditional.statements;

import java.util.Scanner;

public class TradeCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAmountValid;
        double salesAmount = 0;
        double commissionRate = 0;
        String cityName;

        while (true) {
            System.out.print("Please enter the city name: ");
            cityName = scanner.nextLine();
            System.out.print("Please enter the sales amount: ");
            salesAmount = scanner.nextDouble();

            // check invalid input for sales
            if (salesAmount < 0) {
                System.out.println("Error: Invalid sales amount. Please enter a positive number.");
                isAmountValid = false;
                continue;
            } else {
                isAmountValid = true;
            }

            // calculate the commission rate
            if (cityName.equals("London")) {
                if (salesAmount <= 500) {
                    commissionRate = 8;
                } else if (salesAmount <= 1000) {
                    commissionRate = 7;
                } else if (salesAmount <= 10000) {
                    commissionRate = 10;
                } else {
                    commissionRate = 13;
                }
            } else if (cityName.equals("Paris")) {
                if (salesAmount <= 500) {
                    commissionRate = 5;
                } else if (salesAmount <= 1000) {
                    commissionRate = 6;
                } else if (salesAmount <= 10000) {
                    commissionRate = 8;
                } else {
                    commissionRate = 12;
                }
            } else if (cityName.equals("Vienna")) {
                if (salesAmount <= 500) {
                    commissionRate = 4;
                } else if (salesAmount <= 1000) {
                    commissionRate = 5;
                } else if (salesAmount <= 10000) {
                    commissionRate = 9;
                } else {
                    commissionRate = 11;
                }
            } else {
                System.out.println("Error: Invalid city name. Please enter a valid city.");
                isAmountValid = false;
            }

            if (isAmountValid) {
                break;
            }

            scanner.nextLine();
        }

        double tradeCommission = salesAmount * (commissionRate / 100);
        System.out.printf("Trade commission for %s with sales volume $%.2f is $%.2f\n", cityName, salesAmount, tradeCommission);

        scanner.close();
    }
}
