package nested.conditional.statements;
import java.util.Scanner;

public class WorkingDayOrWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Let's check your schedule. Enter a day of the week: ");
        String dayOfWeek = scanner.nextLine().toLowerCase();

        String result = "";
        boolean isValidDay = false;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        while(!isValidDay  && attempts < MAX_ATTEMPTS) {
            switch (dayOfWeek) {
                case "monday":
                case "tuesday":
                case "thursday":
                case "friday":
                    result = "Better be happy, the week is still going on! Enjoy your day.";
                    isValidDay = true;
                    break;
                case "wednesday":
                    result = "It's your day off! Enjoy a break on Wednesday.";
                    isValidDay = true;
                    break;
                case "saturday":
                    result = "Hooray, it's the weekend! Time to relax and have fun.";
                    isValidDay = true;
                    break;
                case "sunday":
                    result = "Enjoy a cup of coffee over the weekend with a friend. It's Sunday!";
                    isValidDay = true;
                    break;
                default:
                    isValidDay = false;
                    result = "Error: Invalid day of the week. Please enter a valid day. ";
                    System.out.println(result);
                    dayOfWeek = scanner.nextLine().toLowerCase();
                    attempts ++;
            }
        }

        if (!isValidDay) {
            System.out.println("Sorry, buddy! You've exceeded the maximum attempts.\nExiting the program. \uD83D\uDE41 Try again later");
        } else {
            System.out.println(result);
        }

        scanner.close();
    }
}

