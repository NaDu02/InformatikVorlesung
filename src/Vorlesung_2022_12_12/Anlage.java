package Vorlesung_2022_12_12;

public class Anlage {

    private double startkapital;
    private double endkapital;
    private int laufzeit;
    private double zinssatz;

    public Anlage(double startkapital, int laufzeit, double zinssatz) {
        this.startkapital = startkapital;
        this.laufzeit = laufzeit;
        this.zinssatz = zinssatz;
        endkapital = berechnungEndkapital();
    }

    private double berechnungEndkapital() {
        double endkapital = startkapital * Math.pow((1 + (zinssatz / 100)), laufzeit);
        return endkapital;
    }

    public String toString() {
        return "Startkapital: " + startkapital + ", Endkapital: " + endkapital + ", Laufzeit: " + laufzeit + ", Zinssatz: " + zinssatz;
    }

    public double getStartkapital() {
        return startkapital;
    }

    public double getEndkapital() {
        return endkapital;
    }

    public int getLaufzeit() {
        return laufzeit;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setLaufzeit(int laufzeit) {
        this.laufzeit = laufzeit;
        setEndkapital(berechnungEndkapital());
    }

    public void setStartkapital(int startkapital) {
        this.startkapital = startkapital;
        setEndkapital(berechnungEndkapital());
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
        setEndkapital(berechnungEndkapital());
    }

    public void setEndkapital(double endkapital) {
        this.endkapital = endkapital;
    }
}