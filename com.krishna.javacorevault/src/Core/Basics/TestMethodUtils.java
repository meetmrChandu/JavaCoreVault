package Core.Basics;


public class TestMethodUtils {
    public static void main(String[] args) {

        // 1. Call simple void method
        MethodUtils.greetUser();  // Output: 👋 Welcome to JavaCoreVault!

        // 2. Method with parameters, no return
        MethodUtils.displayUserDetails("Krishna", 27);

        // 3. Method with return type
        int squared = MethodUtils.square(6);
        System.out.println("Square of 6 is: " + squared);

        // 4. Method using array to return sum
        int[] nums = {10, 20, 30};
        int total = MethodUtils.sumArray(nums);
        System.out.println("Sum of array: " + total);

        // 5. Method returning largest element
        int max = MethodUtils.findMax(nums);
        System.out.println("Maximum in array: " + max);
    }
}
