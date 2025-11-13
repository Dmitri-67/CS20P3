package Mastery;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        System.out.println("\nConvert:");
        System.out.println("1. Inches to Centimeters       5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters         6. Centimeters to Feet");
        System.out.println("3. Yards to Meters             7. Meters to Yards");
        System.out.println("4. Miles to Kilometers         8. Kilometers to Miles\n");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1)
            System.out.println(number + " inches = " + (number * 2.54) + " centimeters.");
        else if (choice == 2)
            System.out.println(number + " feet = " + (number * 30) + " centimeters.");
        else if (choice == 3)
            System.out.println(number + " yards = " + (number * 0.91) + " meters.");
        else if (choice == 4)
            System.out.println(number + " miles = " + (number * 1.6) + " kilometers.");
        else if (choice == 5)
            System.out.println(number + " centimeters = " + (number / 2.54) + " inches.");
        else if (choice == 6)
            System.out.println(number + " centimeters = " + (number / 30) + " feet.");
        else if (choice == 7)
            System.out.println(number + " meters = " + (number / 0.91) + " yards.");
        else if (choice == 8)
            System.out.println(number + " kilometers = " + (number / 1.6) + " miles.");
        else
            System.out.println("Invalid choice.");
    }
}
