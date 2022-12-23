package SSP;

public class ZugBeispiel {
    public static void main(String[] argv) {
        Zug einZug = Zug.Papier;
        Zug andererZug = einZug.vor();
        Zug dritterZug = einZug.zurueck();

        for (Zug a : Zug.values())
            System.out.println(a);

        System.out.println(einZug + " gegen " + andererZug);

        if (einZug.gewinntGegen(andererZug))
            System.out.println(einZug + " gewinnt!");
        if (einZug.verliertGegen(andererZug))
            System.out.println(einZug + " verliert!");

        for (int i = 0; i < 3; i++) {
            System.out.println(dritterZug.schlechter() + " < " + dritterZug + " < " + dritterZug.besser());
            dritterZug = dritterZug.besser();
        }
    }
}
