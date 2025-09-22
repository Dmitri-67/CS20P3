package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a two digit number: ");
        int number = input.nextInt();

        int tens = number / 10;
        int ones = number % 10; 

        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);

        input.close();
    }
}

