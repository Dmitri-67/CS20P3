package SkillBuilders;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("The sum of the numbers is " + sum);

        input.close();
    }
}
