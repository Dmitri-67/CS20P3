package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int root = (int) Math.sqrt(number);

        if (root * root == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}

