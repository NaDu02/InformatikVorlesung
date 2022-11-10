package Vorlesung_2022_11_10;

public class UebungArrays {

    public static void main(String[] args) {
        int n = 1000000;
        double[] a = new double[n];
        int mittelwert = 0;
        int maximum = 0;
        int minimum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * 100;
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            mittelwert += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maximum]) {
                maximum = i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[minimum]) {
                minimum = i;
            }
        }

        System.out.println("Mittelwert: " + mittelwert / a.length);
        System.out.println("Maximum: " + a[maximum]);
        System.out.println("Minimum: " + a[minimum]);

    }
}