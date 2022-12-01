package Vorlesung_2022_12_01;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class ZahlSuchen {

    public static void main(String[] args) {

        int[] zahlen = new int[50000];
        Random zufall = new Random();
        for (int i = 0; i < zahlen.length; i++)
            zahlen[i] = zufall.nextInt(1000);
        Arrays.sort(zahlen);
        System.out.println(position(500, zahlen));
    }

    public static int position(int zahl, int @NotNull [] liste, int von, int bis) {
        int mitte = (von + bis) / 2;
        System.out.println(mitte);
        if (liste[mitte] < zahl && mitte > von) {
            return position(zahl, liste, mitte, bis);
        } else if (liste[mitte] > zahl && mitte < bis) {
            return position(zahl, liste, von, mitte);
        } else if (liste[mitte] == zahl) {
            return mitte;
        } else {
            return -1;
        }
    }

    public static int position(int zahl, int[] liste) {
        return position(zahl, liste, 0, liste.length - 1);
    }
}