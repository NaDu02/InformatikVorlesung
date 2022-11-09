package Vorlesung_2022_11_03;

import java.util.Scanner;

public class RSA {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int k1 = 5;
        int k2 = 69;
        int c = 0;

        if (m < 0 || m > 68){
            System.out.println("p muss zwischen 0 und 68 liegen");
            return;
        }

        c = (int) Math.pow(m, k1) % k2;
        System.out.println("c = " + c);*/

        char m = 'M';
        char s = 'S';

        char c = (char) (Math.pow(s, 5) % 69);
        System.out.println("c = " + c);

    }

}
