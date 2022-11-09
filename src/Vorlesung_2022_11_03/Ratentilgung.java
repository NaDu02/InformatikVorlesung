package Vorlesung_2022_11_03;

import java.util.Scanner;

public class Ratentilgung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Kreditbetrag ein: ");
        double kredit = sc.nextDouble();
        System.out.println("Bitte geben Sie den Zinssatz ein: ");
        final double zins = sc.nextDouble();

        double zinsen = 0;
        double verbleibenderKredit = 0;
        double annuitaet = 0;

        final int jahre = 5;
        final double zinsfaktor = zins/100;
        final double tilgung = kredit/jahre;

        System.out.printf("Jahr | Kredit | Zinsen | Tilgung | Annuität | Verbleibender Kredit%n");

        for (int i = 0; i < jahre; i++){
            zinsen = kredit * zinsfaktor;
            annuitaet =  tilgung + zinsen;
            verbleibenderKredit = kredit - tilgung;
            System.out.printf("%4d | %8.2f | %8.2f | %9.2f | %10.2f | %9.2f %n", i+1, kredit, zinsen, annuitaet, tilgung, verbleibenderKredit);
            kredit = verbleibenderKredit;
        }
    }
}