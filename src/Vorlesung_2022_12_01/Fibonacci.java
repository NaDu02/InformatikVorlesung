package Vorlesung_2022_12_01;

public class Fibonacci {

    public static long fib(long n) {
        return n < 3 ? 1 : fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        for (long  i = 1; i <= 100; i++)
            System.out.println(i + ": " + fib(i));
    }

}
