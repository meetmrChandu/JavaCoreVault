package Core.OOPS;

public class ExceptionHandlingVault {

    /*
     * 🔷 THEORY:
     * Exception Handling in Java helps us manage runtime errors gracefully
     * without crashing the program. It’s implemented using:
     *
     * try – block of code where exceptions may occur
     * catch – handles the specific exception type
     * finally – executes regardless of exception occurrence (cleanup)
     * throw – used to throw a custom exception
     * throws – declares exceptions that a method might throw
     *
     * Types of Exceptions:
     * 1️⃣ Checked – Checked at compile-time (e.g., IOException, SQLException)
     * 2️⃣ Unchecked – Occur at runtime (e.g., NullPointerException, ArithmeticException)
     * 3️⃣ Errors – Serious issues not handled by applications (e.g., OutOfMemoryError)
     */

    public static void main(String[] args) {
        System.out.println("🧩 Exception Handling Vault");

        try {
            int result = divide(10, 0); // triggers ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException ➤ " + ex.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Exception caught ➤ " + e);
        } 
        finally {
            System.out.println("✅ Finally block executed (cleanup done).");
        }

        // Demonstrating custom exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("🚫 Custom Exception: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        return a / b; // possible ArithmeticException
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above for registration.");
        }
        System.out.println("🎉 Access granted!");
    }
}

/*
 * 💡 Custom Exception Example
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

/*
 * 💬 DID YOU KNOW?
 * "finally" will NOT execute only if System.exit(0) is called before it,
 * or if the JVM crashes abruptly.
 * 
 * 💼 INTERVIEW CORNER:
 * Q1. Difference between 'throw' and 'throws'?
 *     ➤ 'throw' is used to explicitly throw an exception, 
 *        while 'throws' declares potential exceptions in method signature.
 * 
 * Q2. Can we catch multiple exceptions in one block?
 *     ➤ Yes, using multi-catch syntax: catch (IOException | SQLException e)
 * 
 * Q3. Can 'finally' block return a value?
 *     ➤ It can, but it overrides any return from 'try' or 'catch' – bad practice.
 * 
 * Q4. What is try-with-resources?
 *     ➤ A special try block (Java 7+) that auto-closes resources implementing AutoCloseable.
 */
