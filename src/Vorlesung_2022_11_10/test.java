package Vorlesung_2022_11_10;

public class test {

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