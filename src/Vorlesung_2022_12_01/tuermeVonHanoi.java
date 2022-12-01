package Vorlesung_2022_12_01;

public class tuermeVonHanoi {

    private int zaehler = 0;

    public static void main(String[] args) {
        tuermeVonHanoi t = new tuermeVonHanoi();
    }

    private tuermeVonHanoi(){
        bewege(3, 'a', 'b', 'c');
        System.out.println("\nAnzahl der Züge: " + zaehler);
    }

    private void bewege(int i, char a, char b, char c){
        if (i > 0) {
            bewege(i - 1, a, c, b);
            zaehler++;
            System.out.println("Verschiebe oberste Scheibe von " + a + " nach " + c);
            bewege(i - 1, b, a, c);
        }
    }
}
