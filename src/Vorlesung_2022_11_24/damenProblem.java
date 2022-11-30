package Vorlesung_2022_11_24;

public class damenProblem {

    public static void main(String[] args) {
        boolean[][] feld = new boolean[4][4];
        ausgabe(feld);
        suche(feld, 4);
    }

    private static void ausgabe (boolean[][] feld){
        for (int i = 0; i < feld.length; i++){
            for (int j = 0; j < feld.length; j++){
                if (feld[i][j]){
                    System.out.print("D");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void suche(boolean[][] feld, int spalte){
        if (spalte == feld.length){
            ausgabe(feld);
        } else {
            for (int i = 0; i < feld.length; i++){
                if (feld[i][spalte]){
                    feld[i][spalte] = true;
                    suche(feld, spalte + 1);
                    feld[i][spalte] = false;
                }
            }
        }
    }
}