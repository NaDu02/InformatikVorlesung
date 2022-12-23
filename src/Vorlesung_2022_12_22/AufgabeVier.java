package Vorlesung_2022_12_22;

public class AufgabeVier {

    public static void main(String[] args) {

        int n = 20;
        int k = n;
        int[][] a = new int[n][20];

        for (int i = 0; i < a.length; i++){
            a[i] = new int[k];
            for (int j = 0; j < k; j++){
                a[i][j] = i * j + j + 1;
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
            k = k - 1;
        }
    }
}