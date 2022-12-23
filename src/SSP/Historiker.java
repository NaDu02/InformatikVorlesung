package SSP;

public class Historiker extends Spieler {

    public Historiker(String name, int spiele) {
        super(name, spiele);
    }

    @Override
    public Zug zug(int n) {
        if (n > 3) {
            if (this.punkte < this.gespielt / 2)
                for (int i = n - 2; i >= 3 && i > n - 20; i--) {
                    if (gegnerZuege[i] == gegnerZuege[n - 1]
                            && gegnerZuege[i - 1] == gegnerZuege[n - 2]
                            && gegnerZuege[i - 2] == gegnerZuege[n - 3]
                            && spielerZuege[i] == spielerZuege[n - 1]
                            && spielerZuege[i - 1] == spielerZuege[n - 2]
                            && spielerZuege[i - 2] == spielerZuege[n - 3]
                    )
                        return gegnerZuege[i + 1].besser();
                }
            for (int i = n - 2; i >= 2 && i > n - 50; i--) {
                if (gegnerZuege[i] == gegnerZuege[n - 1]
                        && gegnerZuege[i - 1] == gegnerZuege[n - 2]
                )
                    return gegnerZuege[i + 1].besser();
            }


        }
        if (n > 1) {
            return gegnerZuege[n - 1].besser();
        }
        return Zug.Schere;

    }
}
