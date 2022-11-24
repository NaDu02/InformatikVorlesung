package Vorlesung_2022_11_24;

import java.util.Random;
import java.util.Arrays;

public class sortGeschwindigkeit {

    public static void main(String[] args) {

        Random r = new Random();
        int random = r.nextInt(100000);
        int[] a = new int[random];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1_000_000_000);
        }

        //Ausgabe der unsortierten Liste
        /*for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }*/

        //Ausgabe Maximalwert
        System.out.println("Maximalwert: " + max(a));
        //Ausgabe Minimalwert
        System.out.println("Minimalwert: " + min(a));
        //Ausgabe Mittelwert
        System.out.println("Mittelwert: " + mittelwert(a));

        int[] bubble = a.clone();
        int[] quick = a.clone();

        // BubbleSort
        long startBubble = System.currentTimeMillis();
        int smaller;
        int bigger;
        boolean run = true;
        for (int i = 0; i < bubble.length && run == true; i++) {
            run = false;

            for (int y = 0; y < bubble.length-1; y++) {
                if(bubble[y] > bubble[y + 1]) {
                    bigger = bubble[y];
                    smaller = bubble[y + 1];
                    bubble[y] = smaller;
                    bubble[y + 1] = bigger;
                    run = true;
                }
            }
        }
        long endBubble = System.currentTimeMillis();

        // Arrays.sort
        long startQuick = System.currentTimeMillis();
        Arrays.sort(quick);
        long endQuick = System.currentTimeMillis();

        // Median berechnen
        int median = 0;
        if (quick.length % 2 == 0) {
            median = (quick[quick.length / 2] + quick[quick.length / 2 - 1]) / 2;
        } else {
            median = quick[quick.length / 2];
        }
        System.out.println("Median: " + median);

        System.out.println("BubbleSort: " + (endBubble - startBubble) + "ms");
        System.out.println("Arrays.sort: " + (endQuick - startQuick) + "ms");
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static double mittelwert(int[] a) {
        double mittelwert = 0;
        for (int i = 0; i < a.length; i++) {
            mittelwert += a[i];
        }
        return mittelwert / a.length;
    }
}