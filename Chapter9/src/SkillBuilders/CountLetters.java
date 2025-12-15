package SkillBuilders;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();

        int[] counts = new int[26];
        int total = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                counts[c - 'a']++;
                total++;
            }
        }

        System.out.println("\nLetter counts:");
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + counts[i]);
            }
        }
        System.out.println("Total letters: " + total);
        in.close();
    }
}
