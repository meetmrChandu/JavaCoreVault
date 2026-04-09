package Core.Basics;

// Demonstrates: 'this', 'super', and 'final' in Java
class User {
    final String role = "USER";  // final variable cannot be reassigned

    String name;

    User(String name) {
        this.name = name;  // 'this' resolves ambiguity between instance and parameter
        System.out.println("User constructor called for: " + this.name);
    }

    final void displayRole() {
        // 'final' method cannot be overridden by subclasses
        System.out.println(name + " has role: " + role);
    }

    void greet() {
        System.out.println("Hello from User");
    }
}

class Admin extends User {

    Admin(String name) {
        super(name);  // Calls parent class constructor
    }

    // Cannot override displayRole() because it's marked 'final'

    void greet() {
        super.greet();  // Call parent's greet
        System.out.println("Admin greeting: Access granted to admin panel.");
    }
}

public class ThisSuperFinalDemo {
    public static void main(String[] args) {
        Admin admin = new Admin("Krishna");
        admin.displayRole();
        admin.greet();
    }
}
