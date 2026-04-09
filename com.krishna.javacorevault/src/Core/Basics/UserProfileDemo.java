package Core.Basics;

import java.util.Scanner;

public class UserProfileDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare basic profile variables
        String name;
        int age;
        float height;
        boolean isDeveloper;

        // Collect input from user
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter your height in feet (e.g., 5.9): ");
        height = scanner.nextFloat();

        System.out.print("Are you a developer? (true/false): ");
        isDeveloper = scanner.nextBoolean();

        // Print the user profile
        System.out.println("\n👤 User Profile Summary:");
        System.out.println("------------------------");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Height   : " + height + " ft");
        System.out.println("Developer: " + (isDeveloper ? "Yes" : "No"));

        scanner.close();
    }
}
