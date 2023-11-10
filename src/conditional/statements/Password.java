package conditional.statements;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = "CataLan";
        String password = "gGdfdfk574743cr3t!P@ssw0rd";
        boolean isValid = false;

        while (!isValid) {

            System.out.print("Please enter your username: ");
            String inputUserName = scanner.nextLine();
            System.out.print("Please enter your password: ");
            String inputPass = scanner.nextLine();

            if (inputPass.equals(password) && inputUserName.equals(userName)) {
                System.out.println("Welcome " + inputUserName + "!");
                isValid = true;
            } else if (!inputUserName.equals(userName)) {
                System.out.println("Invalid username! Please enter a valid username");
            } else if (!inputPass.equals(password)) {
                System.out.println("Invalid password! Please enter a valid password!");
            }
        }
        scanner.close();
    }
}
