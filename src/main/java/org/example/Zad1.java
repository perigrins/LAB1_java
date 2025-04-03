package org.example;

/**
 * @author Hanna Grzebieluch
 **/

public class Zad1 {

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        System.out.print("Triangle area: ");
        System.out.println(heron(a, b, c));
    }

    static double heron(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            // custom exception based on article written by Chaitanya Singh:
            // https://beginnersbook.com/2013/04/throw-in-java/
            // used accordingly later in code
            throw new ArithmeticException("Incorrect input - numbers must be positive");
        }
        else {
            // triangle inequality condition
            if (a+b>c && a+c>b && b+c>a) {
                double p = (a + b + c) / 2.0;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                return s;
            }
            else {
                throw new ArithmeticException("Cannot build a triangle");
            }
        }
    }
}
