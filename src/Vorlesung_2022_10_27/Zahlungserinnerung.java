package Vorlesung_2022_10_27;

import java.util.Scanner;

public class Zahlungserinnerung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie ihren Namen ein: ");
        String name = sc.nextLine();
        System.out.println("Bitte geben Sie ihren Vornamen ein: ");
        String vorname = sc.nextLine();
        System.out.println("Bitte geben Sie ihre Anrede ein: ");
        String anrede = sc.nextLine();
        System.out.println("Bitte geben Sie ihren Pronomen ein: ");
        String pronomen = sc.nextLine();
        System.out.println("Bitte geben Sie ihren Leistung ein, an die Sie erinnert werden wollen: ");
        String leistung = sc.nextLine();
        System.out.println("Bitte geben Sie den Betrag ein: ");
        double betrag = sc.nextDouble();

        System.out.println("Sehr geehrte/r " + anrede + " " + vorname + " " + name + "\n \n" +
                "Wir möchten " + pronomen + " daran erinnern, dass " + pronomen + " uns noch " + betrag + " Euro für " + leistung + " schuldig sind. " +
                "Bitte überweisen " + pronomen + " den Betrag bis zum 31.10.2022 auf unser Konto. " +
                "Sollten " + pronomen + " den Betrag bereits überwiesen haben, ignorieren " + pronomen + " diese E-Mail. " +
                "Sollten " + pronomen + " Fragen haben, wenden " + pronomen + " sich bitte an uns. \n \n" +
                "Mit freundlichen Grüßen, \n \n" +
                "Ihr Pronomen Team");

        sc.close();
    }
}