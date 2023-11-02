package introduction.java;

import java.util.Scanner;

public class PetsFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int dogQty = 0;
        int catQty = 0;
        double dogFoodPrice = 2.5;
        double catFoodPrice = 4;
        boolean isValid = false;

        while(!isValid){
            System.out.print("Please enter the quantity of dog food packages: ");
            if(scanner.hasNextInt()){
                dogQty = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid number \uD83D\uDE1F.Please enter a valid number for dog food packages!");
                scanner.next();
            }
        }

        isValid = false;

        while(!isValid){
            System.out.print("Please enter the quantity of cat food packages: ");
            if(scanner.hasNextInt()){
                catQty = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid number \uD83D\uDE1F.Please enter a valid number for cat food packages!");
                scanner.next();
            }
        }

        if(isValid){
            totalPrice = dogFoodPrice * dogQty + catFoodPrice * catQty;
            System.out.println("The total price for dog and cat food is: " + "£" + totalPrice );
        }

        scanner.close();
    }
}
