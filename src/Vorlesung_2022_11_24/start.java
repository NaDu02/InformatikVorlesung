package Vorlesung_2022_11_24;

import java.util.Scanner;

public class start {

        public static void main(String[] args) {
            PersonallistenVerwaltung[] personen = new PersonallistenVerwaltung[100];
            personen[0] = new PersonallistenVerwaltung();
            personen[0].name = "Max";
            personen[0].telefonnummer = 123456;
            personen[0].personalnummer = 1;

            personen[1] = new PersonallistenVerwaltung();
            personen[1].name = "Moritz";
            personen[1].telefonnummer = 654321;
            personen[1].personalnummer = 2;

            personen[2] = new PersonallistenVerwaltung();
            personen[2].name = "Maximilian";
            personen[2].telefonnummer = 987654;
            personen[2].personalnummer = 3;

            Scanner sc = new Scanner(System.in);
            System.out.print("1 - Ausgabe der Datenstruktur \n2 - Eingabe einer neuen Person \n3 - Löschen einer Person \n4 - Beenden \nIhre Wahl: ");

            int auswahl = 0;
            boolean beenden = false;

            while (!beenden) {
                auswahl = sc.nextInt();
                switch (auswahl) {
                    case 1:
                        for (int i = 0; i < personen.length; i++) {
                            if (personen[i] != null) {
                                System.out.println("Name: " + personen[i].name + " Telefonnummer: " + personen[i].telefonnummer + " Personalnummer: " + personen[i].personalnummer);
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Geben Sie den Namen ein: ");
                        String name = sc.next();
                        System.out.print("Geben Sie die Telefonnummer ein: ");
                        int telefonnummer = sc.nextInt();
                        System.out.print("Geben Sie die Personalnummer ein: ");
                        int personalnummer = sc.nextInt();
                        for (int i = 0; i < personen.length; i++) {
                            if (personen[i] == null) {
                                personen[i] = new PersonallistenVerwaltung();
                                personen[i].name = name;
                                personen[i].telefonnummer = telefonnummer;
                                personen[i].personalnummer = personalnummer;
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Geben Sie die Personalnummer ein: ");
                        int personalnummer2 = sc.nextInt();
                        for (int i = 0; i < personen.length; i++) {
                            if (personen[i] != null) {
                                if (personen[i].personalnummer == personalnummer2) {
                                    personen[i] = null;
                                }
                            }
                        }
                        break;
                    case 4:
                        beenden = true;
                        break;
                    default:
                        System.out.println("Falsche Eingabe!");
                        break;
                }
            }
        }
}