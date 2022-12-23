package SSP;

public class Komposer extends Spieler {
    private Spieler strategieA;
    private Spieler strategieB;

    public Komposer(String name, int spiele) {
        super(name, spiele);
        this.strategieA = new Laeufer(name + ".A", spiele);
        this.strategieB = new Wechsler(name + ".B", spiele);
    }

    @Override
    public Zug zug(int n) {
        if (strategieA.getPunkte() > strategieB.getPunkte())
            return strategieA.zug(n);
        else
            return strategieB.zug(n);
    }

    public void ergebnis(int n, Zug spielerZug, Zug gegnerZug) {
        super.ergebnis(n, spielerZug, gegnerZug);
        strategieA.ergebnis(n, strategieA.zug(n), gegnerZug);
        strategieB.ergebnis(n, strategieB.zug(n), gegnerZug);
    }
}
