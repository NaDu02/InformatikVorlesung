package Vorlesung_2022_11_03;

import java.util.Scanner;

public class Bestehen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Anzahl der Prüfungen ein: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Ungültige Anzahl");
        } else {
            System.out.print("Bitte geben Sie die Bestehenswarscheinlichkeit ein: ");
            int p = sc.nextInt();
            if (p < 5 || p > 95) {
                System.out.println("Ungültige Bestehenswarscheinlichkeit");
            } else {
                double pe = (double) p / 100;
                double p_top = Math.pow(pe, n);
                double p_Zweitversuch = (1 - pe) * pe * Math.pow(pe, n - 1);
                double p_Gesamt = p_top + n * p_Zweitversuch;
                System.out.printf("%8.2f | %8.2f | %8.2f %n", p_top * 100, p_Zweitversuch * 100, p_Gesamt * 100);
            }
        }
    }
}
