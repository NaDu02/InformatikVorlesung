package Vorlesung_2022_10_27;

public class Vektordistanz {

    public static void main(String[] args) {
        int x1 = 2;
        int x2 = -2;
        int y1 = 5;
        int y2 = 2;
        System.out.print(dist(x1, x2, y1, y2));
    }

    public static double dist(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
