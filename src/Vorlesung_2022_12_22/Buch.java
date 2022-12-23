package Vorlesung_2022_12_22;

public class Buch {

    public final String titel;
    public final String autor;
    public final int buchnummer;
    public static int anzahlErzeugten = 0;

    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        anzahlErzeugten++;
        buchnummer = anzahlErzeugten;
    }

    public boolean equals(Object o) {

        if (o != null && o instanceof Buch){
            Buch ob = (Buch) o;
            return titel.equals(ob.titel) && autor.equals(ob.autor);
        }
        return false;
    }

    public int hashCode(){
        return titel.hashCode() + autor.hashCode() * 42;
    }

}
