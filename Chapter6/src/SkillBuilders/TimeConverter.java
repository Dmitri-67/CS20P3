package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        System.out.println("Convert:");
        System.out.println("1. Hours to Minutes      3. Minutes to Hours");
        System.out.println("2. Days to Hours         4. Hours to Days");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1)
            System.out.println(number + " hours = " + (number * 60) + " minutes.");
        else if (choice == 2)
            System.out.println(number + " days = " + (number * 24) + " hours.");
        else if (choice == 3)
            System.out.println(number + " minutes = " + (number / 60) + " hours.");
        else if (choice == 4)
            System.out.println(number + " hours = " + (number / 24) + " days.");
        else
            System.out.println("Invalid choice.");
    }
}
