package basics;

public class OperatorDemo {

    public static void main(String[] args) {

        int x = 10, y = 3;

        // Arithmetic Operators
        int sum = x + y;
        int product = x * y;
        int remainder = x % y;

        // 🔍 % is often asked — used in even/odd checks, circular structures
        // Example: Checking if a number is divisible by 3
        boolean divisibleBy3 = (x % 3 == 0);

        // Relational Operators
        boolean isGreater = x > y;
        boolean isEqual = x == y;

        // Logical Operators (&&, ||, !)
        boolean isValid = (x > 5) && (y < 5); // 🔍 Logical AND is common in input validations
        boolean isAnyTrue = (x < 5) || (y < 5);

        // Unary Operator
        int negX = -x;  // 🔍 Negation often used in toggling values
        x++;            // Post-increment: value used first, then increased
        --y;            // Pre-decrement: value decreased, then used

        // Assignment with operation
        int z = 5;
        z += 3; // 🔍 Compound assignment: z = z + 3

        // Output block
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Remainder = " + remainder);
        System.out.println("Divisible by 3? " + divisibleBy3);
        System.out.println("Is x > y? " + isGreater);
        System.out.println("Is x == y? " + isEqual);
        System.out.println("Logical AND result: " + isValid);
        System.out.println("Logical OR result: " + isAnyTrue);
        System.out.println("Negated x: " + negX);
        System.out.println("Post-increment x: " + x);
        System.out.println("Pre-decrement y: " + y);
        System.out.println("Compound assignment (z += 3): " + z);
    }
}
