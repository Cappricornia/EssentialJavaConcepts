package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class TrainCapacity {
    static final int TOTAL_CAPACITY = 120;
    static final int MAX_GROUP_SIZE = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The number of free places in the train is " + TOTAL_CAPACITY);
        ArrayList<Integer> passengersList = passengersCount(scanner);
        printPassengersArray(passengersList);

        int totalPassengers = calculateTotalPassengers(passengersList);

        System.out.println("Total number of passengers: " + totalPassengers);

        scanner.close();
    }

    // Validate user input
    static int validateInt(Scanner scanner) {
        int value;

        while (true) {
            System.out.print("Enter the number of passengers in the group (maximum " + MAX_GROUP_SIZE + "): ");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();

                if (value > 0 && value <= MAX_GROUP_SIZE) {
                    return value;
                } else {
                    System.out.println("Invalid input! Please enter a positive whole number less than or equal to " + MAX_GROUP_SIZE + ".");
                }
            } else {
                System.out.println("Invalid input! Please enter a positive whole number less than or equal to " + MAX_GROUP_SIZE + ".");
                scanner.next(); // Consume the invalid input
            }
        }
    }

    static ArrayList<Integer> passengersCount(Scanner scanner) {
        int remainingCapacity = TOTAL_CAPACITY;
        ArrayList<Integer> passengersList = new ArrayList<>();

        System.out.println("Please enter the number of passengers in each group, one group at a time. "
                + "Total should not exceed " + TOTAL_CAPACITY + " places:");

        while (remainingCapacity > 0) {
            int currentPassengers = validateInt(scanner);

            if (currentPassengers <= remainingCapacity) {
                passengersList.add(currentPassengers);
                remainingCapacity -= currentPassengers;
            } else {
                System.out.println("Invalid input. The remaining capacity cannot be exceeded.");
            }
        }

        return passengersList;
    }

    // Print all groups of passengers in the array
    static void printPassengersArray(ArrayList<Integer> passengersList) {
        System.out.print("Entered passenger counts: ");

        // Iterate through each element in the passengersList
        for (int i = 0; i < passengersList.size(); i++) {
            System.out.print(passengersList.get(i));
            // Check if the current element is not the last element in the list
            if (i < passengersList.size() - 1) {
                System.out.print(" ");
            }
        }
        // Move to the next line after printing all the elements
        System.out.println();
    }

    static int calculateTotalPassengers(ArrayList<Integer> passengerCounts) {
        int totalPassengers = 0;

        // Iterate through the ArrayList and accumulate the total number of passengers
        for (int count : passengerCounts) {
            totalPassengers += count;
        }

        return totalPassengers;
    }
}







