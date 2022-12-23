package SSP;

/**
 * Der Bleiber bleibt so lange bei seinem
 * Zug, bis er verliert. Dann sucht er
 * einen Ersatz, mit dem er zuletzt gewonnen
 * haette.
 *
 * @author s.ritterbusch
 */
public class Bleiber extends Spieler {
    private Zug aktuellerZug;

    public Bleiber(String name, int spiele) {
        super(name, spiele);

        aktuellerZug = Zug.values()[0];
    }

    public Zug zug(int n) {
        return aktuellerZug;
    }

    protected void verloren(int n, Zug spielerZug, Zug gegnerZug) {
        aktuellerZug = gegnerZug.besser();
    }

}
