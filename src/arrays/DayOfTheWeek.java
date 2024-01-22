package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DayOfTheWeek {
    private static int[] weekDays = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program will display the day of the week based on a number entered between 1 and 7.");

        // Calls the dayOfTheWeek method
        ArrayList<Integer> result = dayOfTheWeek(scanner);
        scanner.close();

        // The value that the user entered and that passed the validation in the dayOfTheWeek method and checks if there is a valid day name
        int day = result.get(0);
        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
        }
    }

    public static ArrayList<Integer> dayOfTheWeek(Scanner scanner) {
        int currentDay = validateInt(scanner);
        ArrayList<Integer> result = new ArrayList<>();

        if (containsDay(weekDays, currentDay)) {
            result.add(currentDay);
        }
        return result;
    }

    private static boolean containsDay(int[] weekDays, int currentDay) {
        for (int day : weekDays) {
            if (day == currentDay) {
                return true;
            }
        }
        return false;
    }

    public static int validateInt(Scanner scanner) {
        String input;
        System.out.println("Please enter a number between 1 and 7: ");

        while (true) {
            if (scanner.hasNext()) {
                input = scanner.next();

                // Validate int from 1 to 7 inclusive
                try {
                    int value = Integer.parseInt(input);

                    // Check for leading zeros
                    if (input.startsWith("0")) {
                        System.out.println("Invalid input! Please enter a positive whole number between 1 and 7 without leading zeros: ");
                    } else if (value >= 1 && value <= 7) {
                        return value;
                    } else {
                        System.out.println("Invalid input! Please enter a positive whole number between 1 and 7: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a positive whole number between 1 and 7: ");
                }
            } else {
                System.out.println("Invalid input! Please enter a positive whole number between 1 and 7: ");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}