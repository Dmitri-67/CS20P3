package Mastery;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        int percentage = input.nextInt();

        char grade; // will hold A, B, C, D, or F

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("The corresponding letter grade is: " + grade);

    }
}
