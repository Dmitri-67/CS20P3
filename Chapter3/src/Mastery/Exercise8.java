package Mastery;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

           System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));

        System.out.println(number2 + " / " + number1 + " = " + (number2 / number1));
        System.out.println(number2 + " % " + number1 + " = " + (number2 % number1));

        input.close();
    }
}
