package SSP;

public class Spieler {
    final String name;

    /**
     * Array der eigenen Zuege in Runden
     */
    protected final Zug[] spielerZuege;

    /**
     * Array der Zuege des Gegners
     */
    protected final Zug[] gegnerZuege;

    /**
     * Aktueller Punktestand
     * +1 fuer gewonnenes Spiel
     * -1 fuer verlorenes Spiel
     */
    protected int punkte;

    /**
     * Gesamter Punktestand
     * +1 fuer gewonnenes Spiel
     * -1 fuer verlorenes Spiel
     */
    protected int punkteGesamt;

    /**
     * Anzahl der aktuell gespielten Spiele
     */
    protected int gespielt;

    /**
     * Anzahl der gesamt gespielten Spiele
     */
    protected int gespieltGesamt;

    /**
     * Konstruktur fuer einen Spieler
     *
     * @param name   Name des Spielers
     * @param spiele Anzahl der Spiele eines Wettkampfs
     */
    public Spieler(String name, int spiele) {
        this.name = name;
        this.punkte = 0;
        this.gespielt = 0;
        spielerZuege = new Zug[spiele];
        gegnerZuege = new Zug[spiele];
    }

    /**
     * Abfrage des Spielernamens
     *
     * @return Spielername
     */
    public String getName() {
        return name;
    }

    /**
     * Aktuelle Punktezahl (+1 gewonnen, -1 verloren, 0 gleichstand)
     *
     * @return Punktezahl
     */
    public int getPunkte() {
        return punkte;
    }

    /**
     * Gesamte Punktezahl (+1 gewonnen, -1 verloren, 0 gleichstand)
     *
     * @return Punktezahl
     */
    public int getPunkteGesamt() {
        return punkteGesamt;
    }

    /**
     * Anzahl der aktuell gespielten Spiele
     *
     * @return Spieleanzahl
     */
    public int getSpiele() {
        return gespielt;
    }

    /**
     * Anzahl der gesamt gespielten Spiele
     *
     * @return Spieleanzahl
     */
    public int getSpieleGesamt() {
        return gespieltGesamt;
    }

    /**
     * Spieler meldet den eigenen Zug
     *
     * @param n Aktuelle Runde (von 0 bis spiele-1)
     * @return Gewaehlten Zug
     */
    public Zug zug(int n) {
        int take = (name.hashCode() & 0xffff) % (Zug.values().length);
        Zug auswahl = Zug.values()[take];
        return auswahl;
    }

    /**
     * Spieler erhaelt Ergebnis
     *
     * @param n          Aktuelle Runde (von 0 bis spiele-1)
     * @param spielerZug Eigene Wahl
     * @param gegnerZug  Wahl des Gegners
     */
    public void ergebnis(int n, Zug spielerZug, Zug gegnerZug) {
        if (n == 0) {
            punkte = 0;
            gespielt = 0;
        }

        spielerZuege[n] = spielerZug;
        gegnerZuege[n] = gegnerZug;

        if (spielerZug.gewinntGegen(gegnerZug)) {
            punkte++;
            punkteGesamt++;
            gewonnen(n, spielerZug, gegnerZug);
        } else if (spielerZug.verliertGegen(gegnerZug)) {
            punkte--;
            punkteGesamt--;
            verloren(n, spielerZug, gegnerZug);
        } else
            gleichstand(n, spielerZug, gegnerZug);

        gespielt++;
        gespieltGesamt++;
    }

    protected void gewonnen(int n, Zug spielerZug, Zug gegnerZug) {
    }

    protected void verloren(int n, Zug spielerZug, Zug gegnerZug) {
    }

    protected void gleichstand(int n, Zug spielerZug, Zug gegnerZug) {
    }

    public String toString() {
        return name + " (" + punkteGesamt + "/" + gespieltGesamt + ")";
    }
}