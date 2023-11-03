package introduction.java;
import java.util.Scanner;

public class WeirdNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        boolean isWeird = false;

        if(N % 2 != 0){
            isWeird = true;
        } else{
            if (N >= 2 && N <= 5) {
                isWeird = false;
            } else if (N >= 6 && N <= 20) {
                isWeird = true;
            } else if (N > 20) {
                isWeird = false;
            }
        }

        if(isWeird){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }

       scanner.close();
    }
}
