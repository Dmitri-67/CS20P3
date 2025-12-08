package Mastery;
import java.util.Scanner;

public class TestExercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        Exercise2 num = new Exercise2(n);

        char choice;

        do { //The menu
            System.out.println("Show (W)hole number.");
            System.out.println("Show (O)nes place number.");
            System.out.println("Show (T)ens place number.");
            System.out.println("Show (H)undreds place number.");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            choice = input.next().toLowerCase().charAt(0);

            if (choice == 'w')													//What happens when user makes a choice
                System.out.println("Whole number is: " + num.getWhole());
            else if (choice == 'o')
                System.out.println("The ones place digit is: " + num.getOnes());
            else if (choice == 't')
                System.out.println("The tens place digit is: " + num.getTens());
            else if (choice == 'h')
                System.out.println("The hundreds place digit is: " + num.getHundreds());

        } while (choice != 'q');

        System.out.println("Goodbye.");
    }
}
