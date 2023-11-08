package conditional.statements;

import java.util.Scanner;

public class UniversityGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the percentage score: ");
        int percentageScore = scanner.nextInt();
        boolean isValid = true;

        if (percentageScore >= 70 && percentageScore <= 100) {
            System.out.println("First-Class Honours");
        } else if (percentageScore >= 60 && percentageScore <= 69) {
            System.out.println("Upper Second-Class Degree");
        } else if (percentageScore >= 50 && percentageScore <= 59) {
            System.out.println("Lower Second-Class Degree");
        } else if (percentageScore >= 40 && percentageScore <= 49) {
            System.out.println("Third Class Degree");
        } else if (percentageScore >= 0 && percentageScore <= 39) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid percentage score");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Percentage Score: " + percentageScore + "%");
        }

        scanner.close();
    }
}
