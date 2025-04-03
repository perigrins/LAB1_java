package org.example;

/**
 * @author Hanna Grzebieluch
 **/

public class Zad4 {

    public static void main(String[] args) {
        exercise_4(5);
    }

    static void exercise_4(int n) {
        // printing recursive and iterative versions
        System.out.print("Fib recursive: ");
        for (int i = 0; i <= n; i++){
            System.out.print(fib_recursive(i) + " ");
        }
        System.out.println("    recursive result: " + fib_recursive(n));
        System.out.print("Fib iterative: ");
        fib_iterative(n);
    }

    static int fib_recursive(int n) {
        if (n < 0) {
            throw new ArithmeticException("Incorrect input - number must be positive");
        }
        else {
            if (n == 0) {
                return 0;
            }
            else if (n == 1) {
                return 1;
            }

            else return fib_recursive(n - 1) + fib_recursive(n - 2);
        }
    }

    static int fib_iterative(int n) {
        if (n < 0) {
            throw new ArithmeticException("Incorrect input - number must be positive");
        }
        else {
            // first two values of a fibonacci sequence
            int a = 0, b = 1;

            for (int i = 0; i <= n; i++) {
                System.out.print(a + " ");
                // b = F(n), a = F(n-1)
                // b = new fib value, a = previous fib value
                b += a;
                a = b - a;
            }

            System.out.println("    iterative result: " + (b-a));
            return b-a;
        }
    }
}
