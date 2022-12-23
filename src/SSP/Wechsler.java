package SSP;

/**
 * Der Wechsler bleibt nur solange bei seinem
 * Zug solange er gewinnt, sonst sucht er
 * den Zug, mit dem er zuletzt gewonnen
 * haette.
 *
 * @author s.ritterbusch
 */
public class Wechsler extends Bleiber {
    public Wechsler(String name, int spiele) {
        super(name, spiele);
    }

    protected void gleichstand(int n, Zug spielerZug, Zug gegnerZug) {
        verloren(n, spielerZug, gegnerZug);
    }
}
