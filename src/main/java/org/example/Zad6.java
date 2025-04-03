package org.example;

/**
 * @author Hanna Grzebieluch
 **/

public class Zad6 {

    public static void main(String[] args) {
        String base_strand = "AATGCTTAG";
        String template_strand = complement(base_strand);
        String rna_strand = transcribe(template_strand);
        System.out.println("template strand (from 3' to 5'): " + template_strand);
        System.out.println("RNA sequence (from 5' to 3'): " + rna_strand);
    }

    // usage of switch based on article: https://www.w3schools.com/java/java_switch.asp

    static String complement(String strand) {
        String new_strand = "";
        for (int i = 0; i < strand.length(); i++) {
            // getting char from string based on article:
            // https://www.geeksforgeeks.org/java-program-to-get-a-character-from-a-string/
            switch (strand.charAt(i)) {
                case 'A':
                    new_strand += 'T';
                    break;
                case 'T':
                    new_strand += 'A';
                    break;
                case 'C':
                    new_strand += 'G';
                    break;
                case 'G':
                    new_strand += 'C';
                    break;
                default:
                    System.out.println("invalid base strand");
                    break;
            }
        }
        return new_strand;
    }

    static String transcribe(String strand) {
        String new_strand = "";
        for(int i = 0; i < strand.length(); i++) {
            // getting char from string based on article:
            // https://www.geeksforgeeks.org/java-program-to-get-a-character-from-a-string/
            switch(strand.charAt(i)) {
                case 'A':
                    new_strand += 'U';
                    break;
                case 'T':
                    new_strand += 'A';
                    break;
                case 'C':
                    new_strand += 'G';
                    break;
                case 'G':
                    new_strand += 'C';
                    break;
                default:
                    System.out.println("invalid base strand");
                    break;
            }
        }
        return new_strand;
    }

    // todo: zad3?
}
