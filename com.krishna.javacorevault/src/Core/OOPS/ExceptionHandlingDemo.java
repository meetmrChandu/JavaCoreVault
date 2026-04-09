package Core.OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ExceptionHandlingDemo {

    // Method that throws a custom checked exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register!");
        } else {
            System.out.println("✅ Age verified successfully!");
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== JAVA EXCEPTION VAULT ===");
        System.out.println("Enter your age: ");

        try {
            // Step 1: Read user input
            int age = Integer.parseInt(reader.readLine());

            // Step 2: Validate the input
            validateAge(age);

            // Step 3: Trigger a simple runtime exception
            System.out.println("\nNow let’s test runtime exceptions!");
            System.out.println("Enter any number to divide 100 by:");
            int divisor = Integer.parseInt(reader.readLine());
            int result = 100 / divisor;
            System.out.println("Result: " + result);

        } catch (InvalidAgeException e) {
            System.out.println("❌ Custom Exception: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("⚠️ Runtime Exception: Cannot divide by zero!");

        } catch (NumberFormatException e) {
            System.out.println("⚠️ Please enter a valid number!");

        } catch (IOException e) {
            System.out.println("⚠️ Input error occurred: " + e.getMessage());

        } finally {
            System.out.println("\n🎯 Program execution completed.");
        }
    }
}
