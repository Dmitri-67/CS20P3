package Mastery;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble(); // number to convert

        // Display menu
        System.out.println("Convert:");
        System.out.println("1. Inches to Centimeters       5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters         6. Centimeters to Feet");
        System.out.println("3. Yards to Meters             7. Meters to Yards");
        System.out.println("4. Miles to Kilometers         8. Kilometers to Miles");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Call a method to handle the choice
        convert(choice, number);
    }


    // Method that decides which conversion to do
    public static void convert(int choice, double num) {
        switch (choice) {
            case 1:
                inchesToCm(num);
                break;
            case 2:
                feetToCm(num);
                break;
            case 3:
                yardsToMeters(num);
                break;
            case 4:
                milesToKm(num);
                break;
            case 5:
                cmToInches(num);
                break;
            case 6:
                cmToFeet(num);
                break;
            case 7:
                metersToYards(num);
                break;
            case 8:
                kmToMiles(num);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Conversion methods:
    public static void inchesToCm(double x) {
        System.out.println(x + " inches = " + (x * 2.54) + " centimeters.");
    }

    public static void feetToCm(double x) {
        System.out.println(x + " feet = " + (x * 30) + " centimeters.");
    }

    public static void yardsToMeters(double x) {
        System.out.println(x + " yards = " + (x * 0.91) + " meters.");
    }

    public static void milesToKm(double x) {
        System.out.println(x + " miles = " + (x * 1.6) + " kilometers.");
    }

    public static void cmToInches(double x) {
        System.out.println(x + " centimeters = " + (x / 2.54) + " inches.");
    }

    public static void cmToFeet(double x) {
        System.out.println(x + " centimeters = " + (x / 30) + " feet.");
    }

    public static void metersToYards(double x) {
        System.out.println(x + " meters = " + (x / 0.91) + " yards.");
    }

    public static void kmToMiles(double x) {
        System.out.println(x + " kilometers = " + (x / 1.6) + " miles.");
    }
    
}