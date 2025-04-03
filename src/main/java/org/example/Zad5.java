package org.example;

import java.util.ArrayList;

/**
 * @author Hanna Grzebieluch
 **/


public class Zad5 {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        list.clear();
        collatz(11);
        System.out.println("max value in a sequence: " + find_max_value(list));
    }

    static void collatz(int c) {
        if (c < 1) {
            throw new ArithmeticException("Incorrect input - number must be positive");
        }
        else {
            list.add(c);

            // 1 is the last element of a sequence
            // if the condition is true, then the program stops
            if (c == 1) {
                int i = list.size() - 3;
                int j = list.size() - 2;
                int k = list.size() - 1;
                // checking if 3 last numbers are 4, 2, 1
                if (list.get(i) == 4 && list.get(j) == 2 && list.get(k) == 1) {
                    System.out.println(list);
                    System.out.println("size before getting into loop: " + (list.size() - 3));
                    return;
                }
            }

            // collatz formula
            if (c % 2 == 0) {
                c = c / 2;
            } else c = 3 * c + 1;

            collatz(c);
        }
    }

    static int find_max_value(ArrayList<Integer> tab) {
        int max = tab.get(0);
        for (int i = 1; i < tab.size(); i++){
            if (tab.get(i) > max) {
                max = tab.get(i);
            }
        }
        return max;
    }
}