package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = in.nextInt();
        in.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = in.nextLine();
        }

        System.out.println("\nStudent Roster");
        for (String name : names) {
            System.out.println(name);
        }
        in.close();
    }
}
