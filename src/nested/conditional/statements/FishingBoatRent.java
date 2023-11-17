package nested.conditional.statements;

import java.util.Scanner;

public class FishingBoatRent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = 0;
        double budget = 0;
        String season = "";
        int people = 0;
        boolean isValid = false;


        // validate input
        while (!isValid) {
            System.out.println("Please enter your budget: ");
            if (scanner.hasNextDouble()) {
                budget = scanner.nextDouble();
                isValid = true;
                scanner.nextLine(); // clean input
            } else {
                System.out.println("Please enter a valid budged!");
                scanner.nextLine(); // clean input
                continue;
            }

            System.out.println("Please enter a season (Spring, Summer, Autumn or Winter: ");
            season = scanner.nextLine();
            if ("Spring".equalsIgnoreCase(season) || "Summer".equalsIgnoreCase(season) || "Autumn".equalsIgnoreCase(season) || "Winter".equalsIgnoreCase(season)) {
                isValid = true;
            } else {
                System.out.println("Please enter a valid season: ");
                season = scanner.nextLine();
            }

            System.out.println("Please enter a number of people!");
            if (scanner.hasNextInt()) {
                people = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Error: Please enter a number of people!");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.next(); // Consume invalid input
                }
                people = scanner.nextInt();
            }
        }
        scanner.nextLine(); // clean the remaining newline character

        // fishing boat price
        if ("Spring".equalsIgnoreCase(season)) {
            rent = 4500;
        } else if ("Summer".equalsIgnoreCase(season)) {
            rent = 5000;
        } else if ("Autumn".equalsIgnoreCase(season)) {
            rent = 4200;
        } else {
            rent = 2000;
        }

        // discount
        if (people <= 6) {
            rent = rent - (rent * 0.1);
        } else if (people <= 9) {
            rent = rent - (rent * 0.15);
        } else {
            rent = rent - (rent * 0.20);
        }


        // if people even number and season not Autumn - discount 5%
        if (people % 2 == 0 && !"Autumn".equalsIgnoreCase(season)) {
            rent = rent - (rent * 0.05);
        }

        // rent boat
        if (budget >= rent) {
            double moneyLeft = budget - rent;
            System.out.printf("Order details:  $%.2f left.\nPeople: %d\nFishing Boat rent: %.2f\nSeason: %s", moneyLeft, people, rent, season);
        } else { // not enough money
            double moneyNeeded = rent - budget;
            System.out.printf("Not enough money! You need $%.2f more to rent the fishing boat.", moneyNeeded);
        }

        scanner.close();
    }
}
