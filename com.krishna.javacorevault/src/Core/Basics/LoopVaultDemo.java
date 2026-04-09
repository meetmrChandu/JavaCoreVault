package Core.Basics;

public class LoopVaultDemo {

    public static void main(String[] args) {

        // for loop: Used when count is known
        for (int i = 1; i <= 5; i++) {
            System.out.println("📦 For Loop: Task #" + i);
        }

        // while loop: Runs as long as condition is true
        int count = 3;
        while (count > 0) {
            System.out.println("🔁 While Loop Countdown: " + count);
            count--;
        }

        // do-while loop: Executes at least once
        int tries = 0;
        do {
            System.out.println("✅ Do-While: Attempt #" + (tries + 1));
            tries++;
        } while (tries < 1);

        // break example: Stop loop when a match is found
        int[] data = {10, 25, 30, 40, 50};
        int search = 30;
        for (int num : data) {
            if (num == search) {
                System.out.println("🎯 Found: " + num);
                break; // exits early
            }
        }

        // continue example: Skip even numbers
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) continue; // skip even
            System.out.println("🔂 Continue Loop (odd): " + i);
        }
    }
}
