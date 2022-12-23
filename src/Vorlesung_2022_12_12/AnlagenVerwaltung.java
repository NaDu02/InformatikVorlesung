package Vorlesung_2022_12_12;

public class AnlagenVerwaltung {

    public static void main(String[] args) {
        Anlage a = new Anlage(1000, 5, 5.0);
        a.setStartkapital(2000);
        a.setLaufzeit(10);
        a.setZinssatz(3.0);
        System.out.println(a.toString());
    }
}