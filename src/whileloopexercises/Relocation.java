package whileloopexercises;

import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the box width: ");
        int placeWidth = validateInt(scanner);
        // Clear the newline character
        scanner.nextLine();

        System.out.print("Please enter the box length: ");
        int placeLength = validateInt(scanner);
        scanner.nextLine();

        System.out.print("Please enter the box height: ");
        int placeHeight = validateInt(scanner);
        scanner.nextLine();

        spaceChecker(scanner, placeWidth, placeLength, placeHeight);
        scanner.close();
    }

    static int validateInt(Scanner scanner) {
        boolean isValidInput = false;
        int value = 0;

        // validate user input
        while (!isValidInput) {

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();

                if (value >= 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Error: Please enter a positive whole number.");
                }
            } else {
                System.out.println("Error: Please enter a positive whole number.");
                scanner.nextLine(); // clear the newline character
                continue;
            }
        }
        return value;
    }

    static void spaceChecker(Scanner scanner, int placeWidth, int placeLength, int placeHeight) {
        int placeVolume = placeWidth * placeLength * placeHeight;
        int spaceOccupied = 0;

        while (spaceOccupied < placeVolume) {

            System.out.print("Enter a number of boxes (or 'done' to finish): ");

            if (scanner.hasNextInt()) {
                int boxes = validateInt(scanner);
                spaceOccupied += boxes;
                System.out.println("You moved " + boxes + " boxes.");
            } else if (scanner.hasNext("done")) {
                // Exit the loop when "done" is entered
                break;
            } else {
                // Handle invalid input
                System.out.println("Invalid input. Please enter a number or 'done'.");
                scanner.next(); // Clear the invalid input to avoid an infinite loop
            }

            scanner.nextLine(); // Clear the newline character
        }

        if (spaceOccupied <= placeVolume) {
            int spaceLeft = placeVolume - spaceOccupied;
            System.out.println(spaceLeft + " Cubic meters left.");
        } else {
            int spaceNeeded = Math.abs(spaceOccupied - placeVolume);
            System.out.println("No more free space left! " + spaceNeeded + " cubic meters more needed.");
        }
    }
}


