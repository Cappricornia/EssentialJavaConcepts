package introduction.java;

import java.util.Scanner;

public class CompleteProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProjects = 0;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of the projects: ");

        if (scanner.hasNextInt()){
            numberOfProjects = scanner.nextInt();
        }else {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }

        int timeToComplete = numberOfProjects * 3;

        String result = String.format("The project manager %s will need %d hours to complete %d project/s.", name, timeToComplete, numberOfProjects);
        System.out.println(result);

        scanner.close();

    }
}
