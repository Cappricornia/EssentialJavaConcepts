package introduction.java;

public class NumbersOneToTen {
    public static void numbersOneToTen (int number) {
        if (number <= 10) {
            System.out.println("The number is: " + number);
            numbersOneToTen(number + 1);
        }
    }
}
