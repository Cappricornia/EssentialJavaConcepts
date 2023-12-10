package whileloopexercises;

import java.util.Scanner;

public class BudgetPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount needed: ");
        double amountNeeded = Double.parseDouble(scanner.nextLine());
        System.out.print("Please enter the amount available: ");
        double amountAvailable = Double.parseDouble(scanner.nextLine());
        budgetChecker(scanner, amountNeeded, amountAvailable);

        scanner.close();

    }

    static void budgetChecker(Scanner scanner, double amountNeeded, double amountAvailable){
        while (true) {

            if (amountAvailable >= amountNeeded) {
                break;
            }

            if(amountAvailable == 0){
                break;
            }
            System.out.print("Please enter 'spend' or 'save': ");
            String action = scanner.nextLine();

            System.out.print("Please enter the amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            if (action.equalsIgnoreCase("spend")) {
                if (amount <= amountAvailable) {
                    amountAvailable -= amount;
                } else {
                    System.out.println("Error: Amount to spend exceeds available funds. No money subtracted.");
                }
            } else if (action.equalsIgnoreCase("save")) {
                amountAvailable += amount;
            } else {
                System.out.println("Error: Invalid action. Please enter 'spend' or 'save'.");
            }

            System.out.println("Current available amount: $" + amountAvailable);
        }

        if (amountAvailable >= amountNeeded) {
            System.out.println("You has reached the desired amount of $" + amountAvailable);
        }

        System.out.println("Final available amount: $" + amountAvailable);
    }
}
