package org.example;

import java.util.Arrays;

/**
 * @author Hanna Grzebieluch
 **/

public class Zad3 {

    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};
        System.out.println("All subsets for set " + Arrays.toString(set) + ":");
        subsets(set);
    }

    static void subsets(char[] set) {
        int n = set.length;
        int max = 1 << n; // 2^n, based on Stanislaw Baranski's answer on question: https://stackoverflow.com/questions/8071363/calculating-powers-of-integers
        for (int i = 0; i < max; i++) {
            // alg is a modified version of user314104's answer on question: https://stackoverflow.com/questions/14224953/get-all-subsets-of-a-set
            // set consisting of n elements always has a number of subsets = 2^n
            // first we iterate through all the subsets in a binary form
            // then we iterate through all bits of the number i
            // if j-th bit of i == 1, j is added as a subset
            System.out.print(" {");
            for (int j = 0; j < n; j++) {
                if ((i & (1<<j)) > 0) {
                    System.out.print((" " + set[j]) + " ");
                }
            }
            System.out.print("} ");
        }
    }
}
