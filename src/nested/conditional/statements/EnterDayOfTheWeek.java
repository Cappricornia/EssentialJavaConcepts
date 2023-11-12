package nested.conditional.statements;

import java.util.Scanner;

public class EnterDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber;

        while (true) {
            System.out.print("Enter a day of the week (1-7): ");

            if (scanner.hasNextInt()) {
                dayNumber = scanner.nextInt();

                if (dayNumber >= 1 && dayNumber <= 7) {
                    break;
                } else {
                    System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // clear the input
            }
        }

        String day;
        String message;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                message = "Today is Monday! Have a great start to the week.";
                break;
            case 2:
                day = "Tuesday";
                message = "Today is Tuesday! Coffee is hot and the week is rolling.";
                break;
            case 3:
                day = "Wednesday";
                message = "Today is Wednesday! Halfway through, keep going!";
                break;
            case 4:
                day = "Thursday";
                message = "Today is Thursday! Almost there, the weekend is approaching.";
                break;
            case 5:
                day = "Friday";
                message = "Today is Friday! Time to celebrate, the weekend is here!";
                break;
            case 6:
                day = "Saturday";
                message = "Today is Saturday! Enjoy the weekend vibes.";
                break;
            case 7:
                day = "Sunday";
                message = "Today is Sunday! Relax and recharge for the upcoming week.";
                break;
            default:
                day = "Invalid day";
                message = "Please enter a valid day (1-7).";
        }

        System.out.println(message);
        scanner.close();
    }
}
