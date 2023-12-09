package whileloopexercises;

import java.util.Scanner;

public class StudyGuide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        examGrade(scanner);
        scanner.close();
    }

    static void examGrade(Scanner scanner) {
        String input;
        int problemsCount = 0;
        String lastProblemName = "";
        int unsatisfactoryGradeCount = 0;
        double avgGrade = 0;

        while (true) {
            // Prompt the user to enter the name of the problem or 'Stop' to end the program
            System.out.print("Enter the name of the problem or 'Stop' to end: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Stop")) {
                break; // Exit the loop if 'Stop' is entered
            }

            // keep the last problem
            lastProblemName = input;

            // Prompt the user to enter the grade for the current problem and validate the grade
            while (true) {
                System.out.print("Enter grade for " + input + ": ");

                if (scanner.hasNextDouble()) {
                    double grade = scanner.nextDouble();
                    avgGrade += grade;
                    problemsCount++;

                    if (grade < 3) {
                        unsatisfactoryGradeCount++;

                        if (unsatisfactoryGradeCount >= 2) {
                            System.out.println("Student is excluded due to two unsatisfactory grades.");
                            return;
                        }
                    }
                    // Clear the newline char
                    scanner.nextLine();
                    break; // Exit the grade input loop
                } else {
                    // Clear the invalid input and display an error message
                    System.out.println("Error: Please enter a valid decimal number for the grade.");
                    scanner.nextLine();
                }
            }
        }

        // Calculate and print average grade
        if (problemsCount > 0) {
            avgGrade /= problemsCount;
            System.out.println("Student average grade is: " + avgGrade);
            System.out.println("The last problem is: " + lastProblemName);

            // Check for stipend eligibility
            if (avgGrade >= 5.50) {
                System.out.println("Congratulations! The student is eligible for a scholarship.");
            } else {
                System.out.println("Unfortunately, no stipend awarded.");
            }
        } else {
            // In case the user enters 'Stop' as the first prompt
            System.out.println("No problems and grades entered.");
        }
    }
}
