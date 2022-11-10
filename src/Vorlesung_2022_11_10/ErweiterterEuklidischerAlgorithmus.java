package Vorlesung_2022_11_10;

public class ErweiterterEuklidischerAlgorithmus {

    public static void main(String[] args) {
        int m = 99;
        int n = 78;

        int am = m;
        int a = n;
        int um = 1;
        int u = 0;
        int vm = 0;
        int v = 1;

        while (a != 0) {
            int r = am / a;
            int ap = am - r * a;
            am = a;
            a = ap;

            int up = um - r * u;
            um = u;
            u = up;

            int vp = vm - r * v;
            vm = v;
            v = vp;
        }

        int ggt = am;
        System.out.println("Der GGT von " + m + " und " + n + " ist " + ggt);
    }
}
