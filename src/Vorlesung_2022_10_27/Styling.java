package Vorlesung_2022_10_27;

/**
 * Berechnet den Mittelwert zweier Zahlen
 */

public class Styling {


    /**
     * Initalisiert zwei Variablen (x und y) und gibt den Mittelwert aus
     *
     * @param args
     */

    public static void main(String[] args) {
        int x = 3;
        int y = 10;
        System.out.println(mi(x, y));
    }

    /**
     * Berechnet den Mittelwert zweier Zahlen und gibt diesen zurück
     */

    public static double mi(double a, double b) {
        return a / 2 + b / 2;
    }

}
