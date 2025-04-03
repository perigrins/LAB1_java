package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Heron")
    void heron() {
        Assertions.assertEquals(6, Zad1.heron(3, 4, 5));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Heron - negative arguments")
    void heron_negative() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Zad1.heron(-1, 4, 5));
        Assertions.assertEquals("Incorrect input - numbers must be positive", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Intersection of 2 sets")
    void intersection() {
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        for (int i = 4; i < 9; i++) {
            set1.add(i);
        }

        for (int i = 2; i < 7; i++) {
            set2.add(i);
        }

        ArrayList<Integer> intersection_test = new ArrayList<>();
        intersection_test.add(4);
        intersection_test.add(5);
        intersection_test.add(6);

        Assertions.assertEquals(intersection_test, Zad2.intersection(set1, set2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Recursive fibonacci")
    void fib_recursive() {
        assertAll(() -> Assertions.assertEquals(3, Zad4.fib_recursive(4)),
                () -> Assertions.assertEquals(0, Zad4.fib_recursive(0)),
                () -> Assertions.assertEquals(1, Zad4.fib_recursive(1)));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Iterative fibonacci")
    void fib_iterative() {
        assertAll(() -> Assertions.assertEquals(3, Zad4.fib_iterative(4)),
                () -> Assertions.assertEquals(0, Zad4.fib_recursive(0)),
                () -> Assertions.assertEquals(1, Zad4.fib_recursive(1)));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Recursive fibonacci - negative numbers")
    void fib_recursive_negative() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Zad4.fib_recursive(-1));
        Assertions.assertEquals("Incorrect input - number must be positive", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Iterative fibonacci - negative numbers")
    void fib_iterative_negative() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Zad4.fib_iterative(-1));
        Assertions.assertEquals("Incorrect input - number must be positive", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Complement and transcribe functions")
    void complement_transcribe() {
        String base = "ATGTTAG";
        String template_strand = Zad6.complement(base);
        String rna_strand = Zad6.transcribe(template_strand);

        // measured beforehand:
        String template_test = "TACAATC";
        String rna_test = "AUGUUAG";

        Assertions.assertEquals(template_strand, template_test);
        Assertions.assertEquals(rna_strand, rna_test);
    }
}