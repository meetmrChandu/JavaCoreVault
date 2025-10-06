package basics;

import java.util.Scanner;

public class ControlFlowDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your performance score (0–100): ");
        int score = scanner.nextInt();

        // 🔍 if-else chain — Interviewers test how you handle branching conditions
        if (score >= 90) {
            System.out.println("Rating: Outstanding");
        } else if (score >= 75) {
            System.out.println("Rating: Excellent");
        } else if (score >= 60) {
            System.out.println("Rating: Good");
        } else if (score >= 40) {
            System.out.println("Rating: Needs Improvement");
        } else {
            System.out.println("Rating: Poor");
        }

        // Example 2 — switch case (used in menu-driven programs)
        System.out.print("\nEnter a day number (1–5): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Day 1: Java Basics");
                break;
            case 2:
                System.out.println("Day 2: OOP Concepts");
                break;
            case 3:
                System.out.println("Day 3: Collections");
                break;
            case 4:
                System.out.println("Day 4: Exception Handling");
                break;
            case 5:
                System.out.println("Day 5: JDBC & Threads");
                break;
            default:
                System.out.println("Invalid day selected.");
        }

        scanner.close();
    }
}