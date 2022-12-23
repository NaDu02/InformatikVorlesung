package SSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turnier {
    private final int spiele;
    private final boolean verbose;

    public class Teilnehmer implements Comparable<Teilnehmer> {
        public final Spieler spieler;
        public int punkte;
        public long nanos;

        public Teilnehmer(Spieler spieler) {
            this.spieler = spieler;
            punkte = 0;
        }

        public boolean equals(Teilnehmer other) {
            return punkte == other.punkte;
        }

        public int compareTo(Teilnehmer o) {
            return o.punkte - punkte;
        }
    }

    private final List<Teilnehmer> teilnehmer;

    public Turnier(int spiele, boolean verbose) {
        this.spiele = spiele;
        this.verbose = verbose;
        teilnehmer = new ArrayList<Teilnehmer>();
    }

    public void addSpieler(Spieler a) {
        teilnehmer.add(new Teilnehmer(a));
    }

    public void starteTurnier() {
        for (int i = 0; i < teilnehmer.size(); i++)
            for (int j = 0; j < i; j++) {
                Teilnehmer a = teilnehmer.get(i);
                Teilnehmer b = teilnehmer.get(j);

                if (verbose)
                    System.out.println(a.spieler + " vs " + b.spieler);

                for (int spiel = 0; spiel < spiele; spiel++) {
                    long startA = System.nanoTime();
                    Zug zugA = a.spieler.zug(spiel);
                    long startB = System.nanoTime();
                    Zug zugB = b.spieler.zug(spiel);
                    long ende = System.nanoTime();

                    a.nanos += (startB - startA);
                    b.nanos += (ende - startB);

                    if (verbose)
                        System.out.print(spiel + ": " + zugA + " x " + zugB);

                    startA = System.nanoTime();
                    a.spieler.ergebnis(spiel, zugA, zugB);
                    startB = System.nanoTime();
                    b.spieler.ergebnis(spiel, zugB, zugA);
                    ende = System.nanoTime();

                    a.nanos += (startB - startA);
                    b.nanos += (ende - startB);

                    if (zugA.gewinntGegen(zugB)) {
                        a.punkte++;
                        b.punkte--;
                    } else if (zugB.gewinntGegen(zugA)) {
                        a.punkte--;
                        b.punkte++;
                    }
                    if (verbose)
                        System.out.println(" (" + a.spieler.getPunkte() + ":" + b.spieler.getPunkte() + ")");
                }
                if (verbose)
                    System.out.println();
            }
        Collections.sort(teilnehmer);
        long nanoaverage = 0;
        int minpunkte = teilnehmer.get(0).punkte;
        System.out.println("Top Player:");
        for (int i = 0; i < teilnehmer.size(); i++) {
            System.out.println((i + 1) + ". " + teilnehmer.get(i).punkte + " " + teilnehmer.get(i).spieler.getName());
            nanoaverage += teilnehmer.get(i).nanos;
            if (teilnehmer.get(i).punkte < minpunkte)
                minpunkte = teilnehmer.get(i).punkte;
        }
        nanoaverage /= teilnehmer.size();
        System.out.println();
        System.out.println("Green Player:");
        for (int i = 0; i < teilnehmer.size(); i++)
            teilnehmer.get(i).punkte = (int) ((teilnehmer.get(i).punkte - minpunkte) * nanoaverage / teilnehmer.get(i).nanos) + minpunkte;
        Collections.sort(teilnehmer);
        for (int i = 0; i < teilnehmer.size(); i++) {
            System.out.println((i + 1) + ". " + teilnehmer.get(i).punkte + " " + teilnehmer.get(i).spieler.getName());
        }
    }


    public static void main(String[] args) {
        int spiele = 10000;
        boolean verbose = false;
        Turnier turnier = new Turnier(spiele, verbose);

        turnier.addSpieler(new Spieler("Spieler", spiele));
        turnier.addSpieler(new Bleiber("Bleiber", spiele));
        turnier.addSpieler(new Wechsler("Wechsler", spiele));
        turnier.addSpieler(new Bohnenzaehler("Bohni", spiele));
        turnier.addSpieler(new Zufall("Zuffi", spiele));
        turnier.addSpieler(new Laeufer("Laeufer", spiele));
        turnier.addSpieler(new Kopierer("Kopierer", spiele));
        turnier.addSpieler(new Komposer("Komposer", spiele));

        turnier.starteTurnier();

    }

}
