package SkillBuilders;

import java.util.Scanner;

public class GradeAvgMod {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter grade 1: ");
        sum += input.nextInt();

        System.out.print("Enter grade 2: ");
        sum += input.nextInt();

        System.out.print("Enter grade 3: ");
        sum += input.nextInt();

        System.out.print("Enter grade 4: ");
        sum += input.nextInt();

        System.out.print("Enter grade 5: ");
        sum += input.nextInt();

        double average = sum / 5.0;

        System.out.println("Average grade: " + average);

        input.close();
    }
}
