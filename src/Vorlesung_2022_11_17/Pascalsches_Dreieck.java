package Vorlesung_2022_11_17;

import java.util.Scanner;

public class Pascalsches_Dreieck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Zeilen ein: ");
        int n = sc.nextInt();

        int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((j == i) || (j == 0)) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
