package org.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Hanna Grzebieluch
 **/

public class Zad2 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 13; i++) {
            list1.add(i);
        }

        for (int i = 2; i < 18; i++) {
            list1.add(i);
        }

        for (int i = 9; i < 16; i++) {
            list2.add(i);
        }

        for (int i = 7; i < 14; i++) {
            list2.add(i);
        }

        // sorting for better legibility
        // based on tckmn's answer on question:
        // https://stackoverflow.com/questions/16252269/how-to-sort-a-list-arraylist
        Collections.sort(list1);
        Collections.sort(list2);

        intersection(list1, list2);
    }

    // based on article:
    // https://www.geeksforgeeks.org/find-the-intersection-of-two-hashsets-in-java/
    // using retainAll() method
    static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // new arraylist intersection is a copy of set A
        // new set was created so as not to lose data from set A
        // then intersection set is compared to set B using function retainAll(), which
        // gives us only the elements in set B, that are in set A
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Set 1: " + list1);
        System.out.println("Set 2: " + list2);
        System.out.println("Intersection set: " + intersection);
        return intersection;
    }
}
