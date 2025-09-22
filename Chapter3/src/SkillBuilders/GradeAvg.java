package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade 1: ");
        int g1 = input.nextInt();
        System.out.print("Enter grade 2: ");
        int g2 = input.nextInt();
        System.out.print("Enter grade 3: ");
        int g3 = input.nextInt();
        System.out.print("Enter grade 4: ");
        int g4 = input.nextInt();
        System.out.print("Enter grade 5: ");
        int g5 = input.nextInt();

        double average = (g1 + g2 + g3 + g4 + g5) / 5;

        System.out.println("Average grade: " + average);

        input.close();
    }
}
