package basics;

public class StaticDemo {

    // Interview Tip: Static variables are shared across all instances
    static int totalUsers = 0;

    // Instance variable
    String name;

    // Static block runs once when class is loaded
    static {
        System.out.println("🔁 Static block executed once when StaticDemo class is loaded.");
    }

    // Constructor
    StaticDemo(String name) {
        this.name = name;
        totalUsers++; // Every time an object is created, increment shared counter
    }

    // Static method – doesn't need object
    public static void showTotalUsers() {
        System.out.println("Total users: " + totalUsers);
    }

    // Instance method
    public void greet() {
        System.out.println("Welcome, " + name + "!");
    }
}
