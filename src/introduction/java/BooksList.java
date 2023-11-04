package introduction.java;
import java.util.Scanner;

public class BooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of pages in the book: ");
        int bookTotalPages = scanner.nextInt();

        System.out.print("Enter pages read per hour: ");
        int pagesPerHour = scanner.nextInt();

        System.out.print("Enter the number of days you want to finish the book: ");
        int daysToFinish = scanner.nextInt();

        int hoursPerDay = (bookTotalPages / pagesPerHour) / daysToFinish;

        // if hours exceed 24h the book cannot be finished for the given time period
        if (hoursPerDay > 24) {
            System.out.println("The book cannot be read in the specified number of days.");
        } else {
            System.out.println("You need to read " + hoursPerDay + " hours per day to finish the book in " + daysToFinish + " days.");
        }

        scanner.close();
    }
}


