package forloopexamples;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {12, 8, 55, 122, 13, 6, 10, 26, 44, 0};

        int sumEvens = sumOfEvenNumbers(numbers);

        System.out.println("The sum of even numbers is: " + sumEvens);
    }


    private static int sumOfEvenNumbers(int[] numbers) {
        int sumEvenNums = 0;

        // Use a for loop to iterate through the array
        for (int number : numbers) {
            // if the current number is even add it to the sum
            if (number % 2 == 0) {
                sumEvenNums += number;
            } else {
                System.out.println("Number " + number + " is odd.");
            }
        }

        return sumEvenNums;
    }
}

