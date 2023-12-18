package forloopexamples;

public class FindMaxNumInArray {
    private static int maxNumber = Integer.MIN_VALUE;

    public static void main(String[] args) {

        int[] numbers = {55, 103, 345, 8231, 15, 0, 21, 45, 56, 245, 4234, 6789, 432};

        // iterate through the array numbers
        for (int number : numbers) {
            maxNumber(number);
        }

        System.out.println("The maximum number in the array is: " + maxNumber);

    }

    private static void maxNumber(int number) {
        if (number > maxNumber) {
            maxNumber = number;
        }
    }
}
