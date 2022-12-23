package SSP;

/**
 * Waehlt einen zufaelligen Zug.
 *
 * @author s.ritterbusch
 */
public class Zufall extends Spieler {
    public Zufall(String name, int spiele) {
        super(name, spiele);
    }

    public Zug zug(int n) {
        int take = (int) (Math.random() * Zug.values().length);
        return Zug.values()[take];
    }
}
