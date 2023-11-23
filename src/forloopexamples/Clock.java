package forloopexamples;

public class Clock {
    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    // add leading zeros
                    String formatH = (h < 10) ? "0" + h : String.valueOf(h);
                    String formatM = (m < 10) ? "0" + m : String.valueOf(m);
                    String formatS = (s < 10) ? "0" + s : String.valueOf(s);

                    System.out.println(formatH + " : " + formatM + " : " + formatS);

                }
            }
        }
    }
}
