package introduction.java;
import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double comboPrice = 10.35;
        double fishNuggetsPrice = 12.4;
        double veggieDreamPrice = 8.15;
        boolean isValid = false;
        int combo = 0;
        int fish = 0;
        int veggie = 0;

        while (!isValid) {
            System.out.print("Please enter the number of Combo Menu: ");
            if (scanner.hasNextInt()) {
                combo = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter a valid number for the Combo Menu!");
                scanner.next();
            }
        }

        isValid = false;

        while (!isValid) {
            System.out.print("Please enter the number of Fish Nuggets Menu: ");
            if (scanner.hasNextInt()) {
                fish = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter a valid number for the Fish Nuggets Menu!");
                scanner.next();
            }
        }

        isValid = false;

        while (!isValid) {
            System.out.print("Please enter the number of Veggie Menu: ");
            if (scanner.hasNextInt()) {
               veggie = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Please enter a valid number for the Veggie Menu!");
                scanner.next();
            }
        }

        double price = combo * comboPrice + fish * fishNuggetsPrice + veggie * veggieDreamPrice;
        double dessert = price * 0.2;
        double totalPrice = price + dessert;

        if(totalPrice <= 40){
            String orderDetails = String.format("Order cost: £%.2f\n===================\n£2.5 delivery", totalPrice);
            System.out.println(orderDetails);
        } else{
            String orderDetails = String.format("Order cost: £%.2f.\n=========================\nEnjoy your free delivery!", totalPrice);
            System.out.println(orderDetails);
        }

        scanner.close();
    }
}
