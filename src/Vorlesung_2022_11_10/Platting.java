package Vorlesung_2022_11_10;

public class Platting {

    public static void main(String[] args) {

        double f = 0.0;

        for (double y = 3; y >= -3; y -= 0.25) {
            for (double x = -5; x < 5; x += 0.125) {
                f = Math.sin(1.1 * x + 1.5 * y) * Math.cos(1.4 * x - 1.2 * y);
                if (f > 0.5) {
                    System.out.print("#");
                } else if (f < -0.5) {
                    System.out.print("-");
                } else if (f < 0.5 && f > 0.0) {
                    System.out.print("+");
                } else if (f > -0.5 && f < 0.0) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
