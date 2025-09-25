package SkillBuilders;

import java.util.Scanner;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter minimum value: ");
        int min = input.nextInt();

        System.out.print("Enter maximum value: ");
        int max = input.nextInt();

        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Random number: " + randomNumber);
    }
}
