package introduction.java;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the fish tank: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the fish tank: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the fish tank: ");
        int height = scanner.nextInt();
        System.out.print("Enter the space occupied percentage of the fish tank: ");
        double percentageOccupied = scanner.nextDouble();

        double volumeInLitres = (length * width * height) / 1000.0; // convert to litres

        // 1 represents the 100% of the available space in the fish tank
        double litresNeeded = volumeInLitres * (1 - (percentageOccupied / 100));
        System.out.println("The fish tank will contain " + litresNeeded + " litres.");

        scanner.close();
    }
}
