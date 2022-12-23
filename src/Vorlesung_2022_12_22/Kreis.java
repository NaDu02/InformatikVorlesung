package Vorlesung_2022_12_22;

public class Kreis extends Ellipse {

    public Kreis(double radius) {
        super(radius, radius);
    }
    public Kreis(){
        this(1);
    }

}
