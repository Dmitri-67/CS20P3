package Mastery;

import java.util.Scanner;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num1 = rand.nextInt(10) + 1; 
        int num2 = rand.nextInt(10) + 1; 
        int op = rand.nextInt(4);       

        int correct = 0; 
        String symbol = ""; 

        if (op == 0) {          
            correct = num1 + num2;
            symbol = "+";
        } else if (op == 1) {   
            correct = num1 - num2;
            symbol = "-";
        } else if (op == 2) {   
            correct = num1 * num2;
            symbol = "*";
        } else {                // division
            correct = num1 / num2;
            symbol = "/";
        }

        System.out.print("What is " + num1 + symbol + num2 + "? ");
        int answer = input.nextInt();

        if (answer == correct)
            System.out.println("Correct!");
        else
            System.out.println("Wrong.");
    }
}
