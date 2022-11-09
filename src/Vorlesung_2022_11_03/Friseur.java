package Vorlesung_2022_11_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Friseur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int preis = 0;

        HashMap<String, Integer> preise = new HashMap<>();
        preise.put("m<=14", 10);
        preise.put("m>14", 14);
        preise.put("nb<=14", 10);
        preise.put("nb>14", 14);
        preise.put("w<=16", 12);
        preise.put("w>16", 20);
        preise.put("trocknen", 5);
        preise.put("färben", 10);

        System.out.println("Wie viele Dienste wollen Sie buchen?");
        int anzahl = sc.nextInt();

        if (anzahl < 1) {
            System.out.println("Sie haben keine Dienste gebucht.");
            return;
        }
        if (anzahl > 10) {
            System.out.println("Sie können maximal 10 Dienste buchen.");
            return;
        }

        if (anzahl != 1) {
            for (int i = 0; i < anzahl; i++) {
                System.out.println("Bitte geben Sie ihr Geschlecht ein oder eine Zusatzleistung: ");
                switch (sc.next()) {
                    case "m":
                        System.out.println("Bitte geben Sie das Alter ein: ");
                        int alter = sc.nextInt();
                        if (alter <= 14) {
                            preis += preise.get("m<=14");
                        } else {
                            preis += preise.get("m>14");
                        }
                        break;
                    case "w":
                        System.out.println("Bitte geben Sie das Alter ein: ");
                        alter = sc.nextInt();
                        if (alter <= 16) {
                            preis += preise.get("w<=16");
                        } else {
                            preis += preise.get("w>16");
                        }
                        break;
                    case "nb":
                        System.out.println("Bitte geben Sie das Alter ein: ");
                        alter = sc.nextInt();
                        if (alter <= 16) {
                            preis += preise.get("nb<=16");
                        } else {
                            preis += preise.get("nb>16");
                        }
                        break;
                    case "trocknen":
                        preis += preise.get("trocknen");
                        break;
                    case "färben":
                        preis += preise.get("färben");
                        break;
                }
            }
        } else {
            System.out.println("Bitte geben Sie den Dienst ein: ");
            String dienst = sc.next();
            if(dienst.equals('w')){

            }
        }

        System.out.println("Der Preis beträgt " + preis + " Euro.");



    }

}
