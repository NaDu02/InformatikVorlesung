package Vorlesung_2022_11_10;

public class PrimzahlsucheMeineVersion {

    public static void main(String[] args) {

            int n = 1000;
            int i = 2;
            int j = 2;
            int k = 0;
            boolean prim = true;

            while (i <= n) {
                while (j < i) {
                    if (i % j == 0) {
                        prim = false;
                    }
                    j++;
                }
                if (prim) {
                    System.out.println(i);
                    k++;
                }
                i++;
                j = 2;
                prim = true;
            }
            System.out.println("Es gibt " + k + " Primzahlen bis " + n);
    }
}