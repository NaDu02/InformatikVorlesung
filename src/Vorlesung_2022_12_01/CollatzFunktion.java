package Vorlesung_2022_12_01;

public class CollatzFunktion {

    public static void main(String[] args) {
        System.out.println(ausfuehren(27));
    }

    //rekursive Collatz-Funktion
    private static int ausfuehren(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return ausfuehren(n / 2) + 1;
        } else {
            return ausfuehren((3 * n+1) / 2) + 1;
        }
    }
}
