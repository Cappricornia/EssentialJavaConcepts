package introduction.java;

import java.util.Scanner;

public class PersonIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.print("Enter your town: ");
        String town = scanner.nextLine();

        String output = String.format("You are %s %s, a %s-years old person from %s.", firstName, lastName, age, town);
        System.out.println(output);

        scanner.close();

    }
}
