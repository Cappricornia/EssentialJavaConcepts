package nested.conditional.statements;

import java.util.Scanner;

public class TitleGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = validateAge(scanner);

        System.out.print("Please enter gender (f/m): ");
        char gender;

        while (true) {
            String genderInput = scanner.nextLine().trim().toLowerCase();

            // validate gender input
            if (!genderInput.isEmpty()) {
                gender = genderInput.charAt(0);
                if (gender == 'f' || gender == 'm') {
                    break;
                } else {
                    System.out.println("Error: Invalid input for gender. Please enter 'f' or 'm'.");
                }
            } else {
                System.out.println("Error: Gender cannot be empty. Please enter 'f' or 'm'.");
            }
        }

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        String title = generateTitle(age, gender);

        String message = String.format("%s %s is %d years old.", title, name, age);
        System.out.println(message);

        scanner.close();
    }

    private static int validateAge(Scanner scanner) {
        int age;
        // validate age
        while (true) {
            System.out.print("Please enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Error: Age must be a positive integer.");
                }
            } else {
                System.out.println("Error: Please enter a valid integer for age.");
                scanner.next();
            }
        }
        return age;
    }

    // create a title
    private static String generateTitle(int age, char gender) {
        if (gender == 'f') {
            if (age < 16) {
                return "Miss";
            } else {
                return "Mrs.";
            }
        } else if (gender == 'm') {
            if (age < 16) {
                return "Master";
            } else {
                return "Mr.";
            }
        } else {
            return "Error";
        }
    }
}

