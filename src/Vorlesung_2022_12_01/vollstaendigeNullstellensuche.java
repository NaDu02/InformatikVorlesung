package Vorlesung_2022_12_01;

public class vollstaendigeNullstellensuche {

    public static void main(String[] args) {
        vollstaendigeNullstellensuche v = new vollstaendigeNullstellensuche();
        v.sucher(-10, 10, 1e-5);
    }

    public double f(double x) {
        return Math.sin(x);
    }

    public void sucher(double a, double b, double distanz) {

        double mitte = (a + b) / 2;
        if (f(mitte) == 0 || mitte == a || mitte == b) {
            if (mitte - a > distanz)
                sucher(a, mitte - distanz, distanz);
            System.out.println(mitte + ", " + f(mitte));
            if (b - mitte > distanz)
                sucher(mitte + distanz, b, distanz);
        } else {
            if (mitte - a > distanz || f(a) * f(mitte) < 0)
                sucher(a, mitte, distanz);
            if (b - mitte > distanz || f(b) * f(mitte) < 0)
                sucher(mitte, b, distanz);
        }


    }

}
