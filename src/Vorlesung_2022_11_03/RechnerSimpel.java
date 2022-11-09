package Vorlesung_2022_11_03;

import java.util.Map;
import java.util.Scanner;

public class RechnerSimpel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double zahl1 = sc.nextDouble();
        char c = sc.next().charAt(0);
        double zahl2 = sc.nextDouble();

        switch (c) {
            case '+':
                System.out.println(zahl1 + zahl2);
                break;
            case '-':
                System.out.println(zahl1 - zahl2);
                break;
            case '*':
                System.out.println(zahl1 * zahl2);
                break;
            case '/':
            case ':':
                System.out.println(zahl1 / zahl2);
                break;
            case '~':
                System.out.println((zahl1 + zahl2) / 2);
                break;
            case 'P':
                System.out.println(Math.pow(zahl1, zahl2));
                break;
            default:
                System.out.println("Fehler");
                break;
        }
    }
}
