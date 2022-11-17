package Vorlesung_2022_11_10;

public class seltsam {

    public static void main(String[] args) {

        int n = 3;
        double i = 3.0;

        for (i = i; i < 2*n; i++) {
            System.out.println(1/(2*(i+1)+1));
        }
        System.out.println("Ende");

        i = 3.0;
        while (i < 2*n) {
            i++;
            System.out.println(1/(2*i+1));
        }
        System.out.println("Ende");

        i = 3.0;
        do {
            i++;
            System.out.println(1/(2*i+1));
        } while (i < 2*n);

        System.out.println("Ende");
    }
}

class test{
    public static void main(String[] args) {
        /*char a = 'a';
        char b = 'a';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a + "" + b++ + "\n");
            }
            a++;
            b = 'a';
        }*/


        /*int n = 10;
        int i = 0;
        int j = 0;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}