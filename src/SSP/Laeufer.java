package SSP;

/**
 * Laeuft regelmaessig alle Varianten durch.
 *
 * @author s.ritterbusch
 */
public class Laeufer extends Spieler {
    public Zug zug(int n) {
        if (n == 0)
            return Zug.values()[0];
        else
            return spielerZuege[n - 1].vor();
    }

    public Laeufer(String name, int spiele) {
        super(name, spiele);
    }
}
