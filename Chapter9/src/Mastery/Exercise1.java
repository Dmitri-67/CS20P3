package Mastery;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {   //Main array and rng (Random number generato)
        int[] numbers = new int[25];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
         
        int[] evens = new int[25];     //The even and odd numbers arrays
        int[] odds  = new int[25];
        int evensCount = 0;
        int oddsCount  = 0;

        for (int i = 0; i < numbers.length; i++) {      //Check if it's even or odd
            int n = numbers[i];
            if (n % 2 == 0) {
                evens[evensCount++] = n;
            } else {
                odds[oddsCount++] = n;
            }
        }

        System.out.println("ODD:");      // The odd Display
        for (int i = 0; i < oddsCount; i++) {
            System.out.print(odds[i] + (i + 1 == oddsCount ? "\n" : " "));
        }

        System.out.println("EVEN:");     // The even Display
        for (int i = 0; i < evensCount; i++) {
            System.out.print(evens[i] + (i + 1 == evensCount ? "\n" : " "));
        }
    }
}
