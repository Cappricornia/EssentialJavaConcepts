package whileloopexercises;

import java.util.Scanner;

public class SearchBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBookName = searchedBook(scanner);
        getSearchedBook(scanner, searchedBookName);

        scanner.close();
    }

    static String searchedBook(Scanner scanner) {
        System.out.println("Enter the name of the book you're looking for: ");
        String searchedBookName = scanner.nextLine();
        return searchedBookName;
    }

    static void getSearchedBook(Scanner scanner, String searchedBookName) {
        System.out.println("Please enter the book name: ");
        boolean isFound = false;
        String currentBook;

        // loop runs until no more books in the catalogue
        while (!(currentBook = scanner.nextLine()).equals("No More Books in the Catalogue")) {

            // if the book is found break the loop
            if (currentBook.equals(searchedBookName)) {
                System.out.println("The book " + searchedBookName + " is available.");
                isFound = true;
                break;
            }

        }
        // this will be executed only if book not found
        if (!isFound) {
            System.out.println("The book " + searchedBookName + " is not available in the Catalogue.");
        }
    }
}
