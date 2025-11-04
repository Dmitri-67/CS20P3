package Mastery;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "Awesome";
        int tries = 0;

        while (tries < 3) {
            System.out.print("Enter the password: ");
            String userInput = input.nextLine();

            if (userInput.equals(password)) {
                System.out.println("Welcome");
                return;
            } else {
                System.out.println("Incorrect Password");
                tries++;
            }
        }

        System.out.println("Access denied.");
    }
}
