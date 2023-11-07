package introduction.java;

import java.util.Scanner;

public class OfficeShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the budget: ");
        double budget = scanner.nextDouble();
        System.out.print("Please enter the number of pen packets: ");
        int penPacks = scanner.nextInt();
        System.out.print("Please enter the number of marker packets: ");
        int markerPacks = scanner.nextInt();
        System.out.print("Please enter the number of office supplies: ");
        int officeSupplies = scanner.nextInt();
        System.out.print("Please enter the discount percentage: ");
        int percentDiscount = scanner.nextInt();

        double penPrice = 9.80;
        double markerPrice = 8.20;
        double suppliesPrice = 15.80;

        double totalCost = (penPacks * penPrice) + (markerPacks * markerPrice) + (officeSupplies * suppliesPrice);
        double discount = (percentDiscount / 100.0) * totalCost;
        double finalCost = totalCost - discount;
        double roundedFinalCost = Double.parseDouble(String.format("%.2f", finalCost));
        double moneyNeeded = finalCost - budget;
        double roundedMoneyNeeded = Double.parseDouble(String.format("%.2f", moneyNeeded));

        if (moneyNeeded <= 0) {
            System.out.printf("Annabelle bought everything for the office.\nThe total price with discount is £%.2f.", roundedFinalCost);
        } else {
            System.out.printf("Annabelle needs £%.2f to pay her bill.", roundedMoneyNeeded);
        }

        scanner.close();
    }

}
