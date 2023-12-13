package whileloopexercises;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    // Program that prompts the user to guess a secret number between 1 and 10.
    public static void main(String[] args) {
        int secretNumber = generateRandomNumber();
        guessNumber(secretNumber);
    }

    private static int generateRandomNumber() {
        // create a random object
        Random random = new Random();
        return random.nextInt(10) + 1;
    }


    public static void guessNumber(int secretNumber) {
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        System.out.println("Guess the secret number between 1 and 10:");

        do {
            System.out.println("Please enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Please enter number higher than: " + userGuess);
            } else if (userGuess > secretNumber) {
                System.out.println("Please enter number lower than: " + userGuess);
                scanner.nextLine();
            } else {
                System.out.println("Congratulations! You guessed the secret number!");
            }

        } while (userGuess != secretNumber);

        scanner.close();
    }
}

