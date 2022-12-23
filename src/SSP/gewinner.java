package SSP;

public class gewinner extends Spieler{

    private Zug aktuellerZug;

    public gewinner(String name, int spiele) {
        super(name, spiele);
        aktuellerZug = Zug.Schere;
    }

    public Zug zug(int n) {
        return aktuellerZug;
    }
}