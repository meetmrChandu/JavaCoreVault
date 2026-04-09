package Core.Basics;

public class MethodUtils {

    // Interview Tip: Use descriptive method names. Follows Java naming conventions.

    // 1. Simple void method (no return, no parameters)
    public static void greetUser() {
        System.out.println("👋 Welcome to JavaCoreVault!");
    }

    // 2. Method with parameters, no return
    public static void displayUserDetails(String name, int age) {
        System.out.println("User: " + name + ", Age: " + age);
    }

    // 3. Method with return type
    public static int square(int num) {
        return num * num;
    }

    // 4. Method handling arrays – returns sum of array elements
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    // 5. Method returning the largest element from an array
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
