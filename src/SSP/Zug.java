package SSP;

public enum  Zug {
	/*
	// Sheldon	
	Stein   { boolean gewinntGegen(Zug b) { return b==Schere || b==Echse; } },
	Schere  { boolean gewinntGegen(Zug b) { return b==Papier || b==Echse; } },
	Papier  { boolean gewinntGegen(Zug b) { return b==Stein  || b==Spock; } }, 
	Echse	{ boolean gewinntGegen(Zug b) { return b==Spock  || b==Papier; } },
	Spock   { boolean gewinntGegen(Zug b) { return b==Schere || b==Stein; } };
	*/
	
	/*	
	// Mit Brunnen
	Stein   { boolean gewinntGegen(Zug b) { return b==Schere; } },
	Schere  { boolean gewinntGegen(Zug b) { return b==Papier; } }, 
	Papier  { boolean gewinntGegen(Zug b) { return b==Stein || b==Brunnen; } },
	Brunnen { boolean gewinntGegen(Zug b) { return b==Stein || b==Schere; } };
	*/


    // Traditionell
    Stein {
        boolean gewinntGegen(Zug b) {
            return b == Schere;
        }
    },
    Schere {
        boolean gewinntGegen(Zug b) {
            return b == Papier;
        }
    },
    Papier {
        boolean gewinntGegen(Zug b) {
            return b == Stein;
        }
    };


    abstract boolean gewinntGegen(Zug b);

    boolean verliertGegen(Zug b) {
        return !(this == b || gewinntGegen(b));
    }

    boolean gleich(Zug b) {
        return this == b;
    }

    Zug vor() {
        return Zug.values()[(this.ordinal() + 1) % Zug.values().length];
    }

    Zug zurueck() {
        return Zug.values()[(this.ordinal() + Zug.values().length - 1) % Zug.values().length];
    }

    Zug besser() {
        Zug neu = this;
        while (!verliertGegen(neu))
            neu = neu.vor();
        return neu;
    }

    Zug schlechter() {
        Zug neu = this;
        while (!gewinntGegen(neu))
            neu = neu.vor();
        return neu;
    }

}