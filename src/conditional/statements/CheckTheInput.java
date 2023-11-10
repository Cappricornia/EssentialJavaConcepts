package conditional.statements;

import java.util.Scanner;

public class CheckTheInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0-9 inclusive, an alphabet character, or a special character: ");
        String input = scanner.next();

        if (input.matches("^[0-9]$")) {
            System.out.println("The input is a number. -> " + input);
        } else {
            if (input.matches("^[A-Za-z]$")) {
                System.out.println("The input is an alphabet character. -> " + input);
            } else if (input.matches("[^\\w]")) {
                System.out.println("The input is a special character. -> " + input);
            } else {
                System.out.println("Invalid input!");
            }
        }

        scanner.close();
    }
}
