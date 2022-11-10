package Vorlesung_2022_11_10;

public class PrimzahlsucheDozentVersion {

    public static void main(String[] args) {
        int von = 1;
        int bis = 1000;

        Suche:
        while (true) {
            int kand = (int)(Math.random() * (bis - von + 1)) + von;

            for (int i = 2; i <= kand / 2; i++) {
                if (kand % i == 0) {
                    System.out.println(i + " teilt " + kand);
                    continue Suche;
                }
            }
            System.out.println("Primzahl gefunden: " + kand);
            break;
        }
    }
}