package introduction.java;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the currency (GBP, USD, or EUR): ");
        String currency = scanner.next();
        System.out.print("Please enter the amount: ");
        double amount = scanner.nextDouble();

        double gbpToBgn = 2.25742;
        double usdToBgn = 1.8209;
        double eurToBgn = 1.95583;

        double convertedAmount = 0;

        switch (currency) {
            case "GBP":
                convertedAmount = amount * gbpToBgn;
                break;
            case "USD":
                convertedAmount = amount * usdToBgn;
                break;
            case "EUR":
                convertedAmount = amount * eurToBgn;
                break;
            default:
                System.out.println("Invalid currency entered.");
                return;
        }

        System.out.println("Converted amount in BGN: " + convertedAmount);

        scanner.close();
    }
}
