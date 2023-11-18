package nested.conditional.statements;

import java.util.Scanner;

public class Holiday {

    // constants
    public static final int SINGLE_ROOM = 200;
    public static final int DOUBLE_ROOM = 340;
    public static final int APARTMENT = 450;
    public static final int PRESIDENTIAL_SUITE = 800;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nights = validateNights(scanner);
        String roomType = validateRoomType(scanner);
        // result
        double finalCost = calculateCost(nights, roomType);

        System.out.printf("The final cost for your stay is $%.2f.\nEnjoy your time!", finalCost);

        scanner.close();
    }

    // validate nights
    private static int validateNights(Scanner scanner) {
        int nights = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Please enter the number of nights you plan to stay in the hotel: ");
            if (scanner.hasNextInt()) {
                nights = scanner.nextInt();
                if (nights > 0) {
                    isValid = true;
                } else {
                    System.out.println("Error: Please enter a correct number of nights!");
                }
            } else {
                System.out.println("Error: Please enter a valid whole number.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.nextLine();
        return nights;
    }

    // validate roomType
    private static String validateRoomType(Scanner scanner) {
        String roomType = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Please enter type of room (single room, double room, apartment, presidential suite): ");
            roomType = scanner.nextLine().toLowerCase();

            switch (roomType) {
                case "single room":
                case "double room":
                case "apartment":
                case "presidential suite":
                    isValid = true;
                    break;
                default:
                    System.out.println("Error: Please enter a valid type of room.");
                    break;
            }
        }

        return roomType;
    }

    // Calculate the total cost based on room type and cost per night, and discount
    private static double calculateCost(int nights, String roomType) {
        double costPerNight = 0;
        double totalCost = 0;

        switch (roomType) {
            case "single room":
                costPerNight = SINGLE_ROOM;
                break;
            case "double room":
                costPerNight = DOUBLE_ROOM;
                break;
            case "apartment":
                costPerNight = APARTMENT;
                break;
            case "presidential suite":
                costPerNight = PRESIDENTIAL_SUITE;
                break;
        }


        // discount 15%
        if ("presidential suite".equalsIgnoreCase(roomType) && nights > 6) {
            totalCost = nights * costPerNight - (nights * costPerNight * 0.15);
        } else {
            totalCost = nights * costPerNight;
        }

        return totalCost;
    }
}