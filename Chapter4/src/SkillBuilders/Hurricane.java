package SkillBuilders;

import java.util.Scanner;

public class Hurricane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hurricane category (1-5): ");
        int category = input.nextInt();

        if (category == 1) {
            System.out.println("Wind Speed: 74-95 mph or 64-82 kt or 119-153 km/hr");
        } else if (category == 2) {
            System.out.println("Wind Speed: 96-110 mph or 83-95 kt or 154-177 km/hr");
        } else if (category == 3) {
            System.out.println("Wind Speed: 111-130 mph or 96-113 kt or 178-209 km/hr");
        } else if (category == 4) {
            System.out.println("Wind Speed: 131-155 mph or 114-135 kt or 210-249 km/hr");
        } else if (category == 5) {
            System.out.println("Wind Speed: greater than 155 mph or 135 kt or 249 km/hr");
        } else {
            System.out.println("Can't be bigger than 5.");
        }
    }
}
