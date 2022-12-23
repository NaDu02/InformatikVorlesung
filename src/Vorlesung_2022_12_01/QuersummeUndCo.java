package Vorlesung_2022_12_01;

public class QuersummeUndCo {

    public static void main(String[] args) {
        //System.out.println(quersumme(1329));
        //System.out.println(binaer(10));
        System.out.println(prim(19));
    }

    //rekursive Quersummen-Funktion
    private static int quersumme(int n) {
        if (n < 10) {
            return n;
        } else {
            return quersumme(n / 10) + n % 10;
        }
    }

    //rekursive Binär-Darstellung
    private static String binaer(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return binaer(n / 2) + n % 2;
        }
    }

    //rekursive Primzahl-Funktion
    private static boolean prim(int n) {
        return prim(n, n/2);
    }
    private static boolean prim(int n, int teiler){
        if (teiler == 1){
            return true;
        } else {
            return (n % teiler != 0) && prim(n, teiler - 1);
        }
    }
}