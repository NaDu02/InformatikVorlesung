package Vorlesung_2022_11_10;

public class Klausuraufgabe {

    public static void main(String[] args) {
        int p = 3;
        int q = 9;

        while (true){
            if (q > 0){
                q = q - p;
                System.out.println(q);
            } else {
                p = p - 1;
                q = p * 3;
                if (p == 0){
                    break;
                }
            }
        }
    }
}

class KlausuraufgabeLehrer {

    public static void main(String[] args) {
        int p = 3;
        int q = 9;

        while (p != 0){
            if (q > 0){
                q = q - p;
                System.out.println(q);
            } else {
                p = p - 1;
                q = p * 3;
            }
        }
    }
}