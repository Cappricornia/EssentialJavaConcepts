package introduction.java;
import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Please enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        String formattedArea = String.format("%.2f", area);

        System.out.println("The area of the rectangle is: " + formattedArea +  "^-^");

        scanner.close();
    }
}
