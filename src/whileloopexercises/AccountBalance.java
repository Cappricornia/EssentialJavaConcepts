package whileloopexercises;

import java.util.Scanner;

public class AccountBalance {

    private static double currentBalance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the initial amount: ");
        double initialAmount = validateAmount(scanner);
        currentBalance = initialAmount;

        while (currentBalance != 0) {
            System.out.println("Enter the next transaction amount (positive for deposit, negative for withdrawal, 0 to stop): ");
            double transactionAmount = validateAmount(scanner);

            // Check if the entered amount is exactly 0 to stop the loop
            if (transactionAmount == 0) {
                System.out.println("Transaction stopped. Final Balance: $" + currentBalance);
                break;
            }

            String resultMsg = accountBalance(transactionAmount);
            System.out.println(resultMsg);
            if (resultMsg.contains("Not enough money")) {
                System.out.println("Transaction cancelled. Final Balance: $" + currentBalance);
                return; // Exit the program if not enough money in the account
            }

        }

        scanner.close();
    }

    static double validateAmount(Scanner scanner) {
        boolean isValidInput = false;
        double num = 0.0;

        // validate user input
        while (!isValidInput) {
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                isValidInput = true;
            } else {
                System.out.println("Error: Please enter a valid amount.");
                scanner.nextLine(); // Clear input
            }
        }
        scanner.nextLine(); //Clear input

        return num;
    }

    public static String accountBalance(double amount) {
        String balanceMsg = "";

        if (amount > 0) {
            currentBalance += amount;
            balanceMsg = "Deposit successful. New Balance: $" + currentBalance;
        } else if (Math.abs(amount) <= currentBalance) {
            currentBalance -= Math.abs(amount);
            balanceMsg = "Withdrawal successful. Your current balance is now: $" + currentBalance;
        } else {
            balanceMsg = "Not enough money. Withdrawal unsuccessful. Current Balance: $" + currentBalance;
        }

        return balanceMsg;
    }
}
