package Vorlesung_2022_12_22;

public class main {
    public static String compute(int a) {
        if (a > 0)
            return compute(a / 2) + (a & 1);
        return " Voilá: ";
    }

    public static void main(String[] args) {
        System.out.println(compute(42));
    }
}
