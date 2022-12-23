package SSP;

/**
 * Der Bohnenzaehler zaehlt, mit welcher
 * Wahl er das meiste oder wenigste
 * Glueck hatte, und waehlt immer
 * den besten.
 * <p>
 * +3 fuer gewinnen
 * -1 fuer gleichstand
 * -2 fuer verlieren
 *
 * @author s.ritterbusch
 */
public class Bohnenzaehler extends Spieler {
    private int[] zaehler;

    public Bohnenzaehler(String name, int spiele) {
        super(name, spiele);

        zaehler = new int[Zug.values().length];
    }

    public Zug zug(int n) {
        if (n == 0) // neues Spiel!
            for (int i = 0; i < zaehler.length; i++)
                zaehler[i] = 0;

        int take = 0;

        for (int i = 1; i < zaehler.length; i++)
            if (zaehler[i] > zaehler[take])
                take = i;

        return Zug.values()[take];
    }

    protected void gewonnen(int n, Zug spielerZug, Zug gegnerZug) {
        zaehler[spielerZug.ordinal()] += 3;
    }

    protected void verloren(int n, Zug spielerZug, Zug gegnerZug) {
        zaehler[spielerZug.ordinal()] -= 2;
    }

    protected void gleichstand(int n, Zug spielerZug, Zug gegnerZug) {
        zaehler[spielerZug.ordinal()] -= 1;
    }

}
