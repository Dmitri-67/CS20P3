package Mastery;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int number = input.nextInt();

        int hundreds = number / 100;        
        int tens = (number / 10) % 10;      
        int ones = number % 10;             

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);

        input.close();
    }
}

