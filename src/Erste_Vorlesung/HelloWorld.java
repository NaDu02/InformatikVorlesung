package Erste_Vorlesung;

public class HelloWorld {
    public static void main(String args[]) {

        /* Ausgangsquellcode
        int produkt;
        produkt = 17 * 4;
        System.out.println("Hallo Welt");
        System.out.println(produkt);
        */

        /* Aufgabe 1
        double zahl1 = 22.0;

        double zahl2 = 7.0;

        System.out.println(zahl1/zahl2);
        */

        /* Aufgabe 2
        double geld = 1000;
        double zins = 1.02;
        for (int i = 0; i<5; i++){
            geld = geld * zins;
        }
        System.out.printf("Geld nach fünf Jahren: %.2f",geld);
        */

        System.out.println("Hallo_" + args[0]);
    }
}