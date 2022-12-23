package SSP;

public class Kopierer extends Spieler {
    public Zug zug(int n) {
        if (n == 0)
            return Zug.values()[0];
        else
            return gegnerZuege[n - 1];
    }

    public Kopierer(String name, int spiele) {
        super(name, spiele);
    }

}
