package nestedloops;

public class SimpleClock {
    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {

                String formatHour = (h < 10) ? "0" + h : String.valueOf(h);
                String formatMinutes = (m < 10) ? "0" + m : String.valueOf(m);

                System.out.printf("The time is %s:%s%n", formatHour, formatMinutes);
            }
        }
    }
}
