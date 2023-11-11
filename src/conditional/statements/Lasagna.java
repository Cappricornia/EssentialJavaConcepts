package conditional.statements;

import java.util.Scanner;

public class Lasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter actual minutes in oven: ");
        int actualMinutesInOven = scanner.nextInt();
        System.out.println("Enter number of layers: ");
        int numberOfLayers = scanner.nextInt();

        String flourType = "";
        boolean isValidFlourType = false;

        while (!isValidFlourType) {
            scanner.nextLine();
            System.out.println("Enter flour type (whole or white): ");
            flourType = scanner.nextLine();

            // Check if the flour type is valid
            if (flourType.equals("whole") || flourType.equals("white")) {
                isValidFlourType = true;
            } else {
                System.out.println("Invalid flour type. Please enter 'whole' or 'white'.");
            }
        }

        int totalTime = lasagna.totalTimeInMinutes(numberOfLayers, actualMinutesInOven, flourType);

        if (totalTime < lasagna.expectedMinutesInOven()) {
            System.out.println("Warning: The total time is less than expected (40 minutes). The lasagna may be undercooked.");
        } else if (totalTime > lasagna.expectedMinutesInOven()) {
            System.out.println("Oh No! The lasagna is burned!");
        } else {
            System.out.println("Total time to prepare the Lasagna with " + flourType + " flour: " + totalTime + " minutes");
        }
        scanner.close();
    }

    public int expectedMinutesInOven() {
        return 40;
    }

    public int preparationTimeInMinutes(int numberOfLayers, String flourType) {
        // approx. each layer takes 2 minutes to prepare depending on the flour type
        int minutesPerLayer = 2;

        if (flourType.equals("whole")) {
            minutesPerLayer += 1;
        } else if (flourType.equals("white")) {
            minutesPerLayer -= 1;
        }

        return numberOfLayers * minutesPerLayer;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven, String flourType) {
        int preparationTime = preparationTimeInMinutes(numberOfLayers, flourType);
        return preparationTime + actualMinutesInOven;
    }
}
