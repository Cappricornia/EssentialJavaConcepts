package whileloopexercises;
import java.util.Scanner;

public class BudgetPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount needed: ");
        double amountNeeded = validateAmount(scanner);

        // Clear the newline character
        scanner.nextLine();

        System.out.print("Please enter the amount available: ");
        double amountAvailable = validateAmount(scanner);

        scanner.nextLine();

        budgetChecker(scanner, amountNeeded, amountAvailable);
        scanner.close();
    }


    static double validateAmount(Scanner scanner) {
        boolean isValidInput = false;
        double amount = 0;

        // validate user input
        while (!isValidInput) {

            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();

                if (amount >= 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Error: Please enter a positive decimal number.");
                }
            } else {
                System.out.println("Error: Please enter a positive decimal number.");
                scanner.nextLine(); // clear the newline character
                continue;
            }
        }
        return amount;
    }


    static void budgetChecker(Scanner scanner, double amountNeeded, double amountAvailable) {
        // The user can make max 10 transaction in one loop, if the loop doesn't break under any other condition, this will break it.
        int maxTransactions = 10;
        int transactionCount = 0;

        while (true) {

            if (transactionCount == maxTransactions || amountAvailable < 0) {
                break;
            }

            if (amountAvailable >= amountNeeded) {
                break;
            }

            if (amountAvailable == 0) {
                System.out.println("Final available amount: $" + amountAvailable);
                break;
            }

            System.out.print("Please enter 'spend' or 'save': ");
            String action = scanner.nextLine();

            System.out.print("Please enter the amount: ");
            double amount = validateAmount(scanner);
            scanner.nextLine();

            if (action.equalsIgnoreCase("spend")) {
                if (amount <= amountAvailable) {
                    amountAvailable -= amount;
                } else {
                    System.out.println("Error: Amount to spend exceeds available funds. No money subtracted.");
                    System.out.println("Final available amount: $" + amountAvailable);
                    break;
                }
            } else if (action.equalsIgnoreCase("save")) {
                amountAvailable += amount;
            } else {
                System.out.println("Error: Invalid action '" + action + "'. Please enter 'spend' or 'save'.");
            }

            System.out.println("Current available amount: $" + amountAvailable);
            transactionCount++;
        }

        if (amountAvailable >= amountNeeded) {
            System.out.println("You has reached the desired amount of $" + amountAvailable);
        }

        if (transactionCount == maxTransactions) {
            System.out.println("Maximum number of transactions reached. Final available amount: $" + amountAvailable);
        }
    }
}
