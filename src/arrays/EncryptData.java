package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EncryptData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArray = storeNamesInArray(scanner);
        encryptedNumbers(namesArray);

        scanner.close();
    }

    static String[] storeNamesInArray(Scanner scanner) {
        int numberNames = validateInt(scanner);

        // Store the names in an array
        String[] namesArray = new String[numberNames];

        // Loop to input names and add them to the array
        for (int i = 0; i < numberNames; i++) {
            System.out.print("Please enter name #" + (i + 1) + ": ");
            String name = scanner.next();
            namesArray[i] = name;
        }
        return namesArray;
    }

    static int validateInt(Scanner scanner) {
        int value = 0;
        System.out.println("Please enter the number of names you would like to encrypt.");
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                // Validate that the int is positive number
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Invalid input! Please enter a positive whole number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a positive whole number.");
                scanner.next(); // Consume the invalid input
            }
        }
    }

    static void encryptedNumbers(String[] namesArray) {
        //Creates an array named sums with the length equal to the number of names in the namesArray
        int[] sums = new int[namesArray.length];

        // Calculate the sum of encrypted numbers for each name
        for (int i = 0; i < namesArray.length; i++) {
            String name = namesArray[i];
            int sum = 0;

            // Process each character in the name
            for (int j = 0; j < name.length(); j++) {
                char ch = name.charAt(j);

                // Calculate the code for each character
                int code;
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    code = (int) ch * name.length(); // Multiply code of vowel by string length
                } else {
                    code = (int) ch / name.length(); // Divide code of consonant by string length
                }

                // Add the code to the sum
                sum += code;
            }

            // Store the sum in the array
            sums[i] = sum;
        }

        // Sort the sums in ascending order
        Arrays.sort(sums);

        // Print the sorted sequence of sums
        System.out.print("Sorted sequence of encrypted names: >>>> [");
        // Iterates over the array sums
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]);
            // Check if it's not the last element in the array
            if (i < sums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] <<<<");
    }
}
