package Vorlesung_2022_12_22;

public class Ellipse {

    public final double a;
    public final double b;

    public Ellipse(double x, double y) {

        this.a = x;
        this.b = y;

        try {
            if (x <= 0 && y <= 0)
                throw new Exception("Nur positive Zahlen");
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    public double flaeche() {
        return Math.PI * a * b;
    }
}