package Vorlesung_2022_12_22;

public class test {

    public static void main(String[] args) {
        aufgabeVier();
    }

    public static void aufgabeEins() {
        int a = 11 / 3;
        double b = 'a' - 'b';
        byte c = (byte) 64;
        byte d = (byte) 2 << 1;
        byte e = (byte) (c * d);
        int f = 2 ^ 11;
        double g = -c++ + 3;
        int h = -++d + 1;
        int i = 17 % 7;
        int j = 37 | 14;
        int k = 0x13;
        int l = (~1) & 077;

        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d + " e = " + e + " f = " + f + " g = " + g + " h = " + h + " i = " + i + " j = " + j + " k = " + k + " l = " + l);
    }

    public static void aufgabeZwei() {
        int p = 3;
        int q = 2;

        while (q != 0) {
            q = q - 1;
            p = p + q;
        }

        System.out.println(p);
    }

    public static void aufgabeVier() {

        int x = 17;

        if (x % 5 == 2) {
            int y = 13 + x;
            y ^= 13;
            System.out.print(y + ", ");
            x -= 13;
            System.out.print(x + ", ");
        } else {
            System.out.print(33 + ", ");
        }

        switch (x) {
            case 5:
                int y = 3;
                System.out.print(12 + y + ", ");
            case 4:
                y = 2;
                System.out.print(99 + ", ");
                break;
            default:
                y = 1;
                System.out.print(5 + y + ", ");
        }

        if (++x <= x)
            System.out.print(x);
        else
            System.out.print(11);

        System.out.println();
    }

    public static void aufgabeFuenf() {
        for (int i = 1; i <= 13; i = i + 2) {
            System.out.print(i + ",");
        }
        System.out.println();

        int j = 1;
        while (j <= 13) {
            System.out.print(j + ",");
            j = j + 2;
        }
        System.out.println();

        int k = 1;
        do {
            System.out.print(k + ",");
            k = k + 2;
        } while (k <= 13);
        System.out.println();
    }
}