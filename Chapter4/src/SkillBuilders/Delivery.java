package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();

        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }
    }
}
