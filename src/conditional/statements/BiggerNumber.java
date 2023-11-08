package conditional.statements;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's find the bigger number!\n\uD83D\uDC47\uD83C\uDFFB\uD83D\uDC47\uD83C\uDFFB\uD83D\uDC47\uD83C\uDFFB");
        System.out.println("Great!\nPlease enter a fantastic number:  ");
        int firstNumber = scanner.nextInt();

        System.out.println("Want to enter another fantastic number?  ");
        int secondNumber = scanner.nextInt();

        int biggerNumber = Math.max(firstNumber, secondNumber);
        System.out.println("Attention, please!...And the triumphant number is: " + biggerNumber + "  \uD83C\uDF8A");

        scanner.close();
    }
}
