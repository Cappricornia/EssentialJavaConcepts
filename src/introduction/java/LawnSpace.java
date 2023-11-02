package introduction.java;

import java.util.Scanner;

public class LawnSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lawnSpace = 0;
        boolean isValid = false;

        while(!isValid) {
            System.out.println("Please enter the desired lawn space: ");
            if (scanner.hasNextDouble()) {
                lawnSpace = scanner.nextDouble();
                isValid = true;
            } else {
                System.out.println("Please enter a valid number for the desired lawn space: ");
                scanner.next();
            }
        }

        double pricePerSqM = 7.61;
        double price = lawnSpace * pricePerSqM;
        double discount = price * 0.18;
        double finalPrice = price - discount;

        if(isValid){
            String result = String.format("The final price is: %.2f lv.\nThe discount is: %.2f lv.", finalPrice, discount);
            System.out.println(result);
        }
        scanner.close();
    }
}
