package basics;

class Employee {
    void work() {
        System.out.println("Employee works 9 to 5");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager works anytime, handles meetings");
    }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.work();  // Base method

        Manager m1 = new Manager();
        m1.work();  // Overridden method

        // Polymorphism:
        Employee ref = new Manager();  // Base type, child object
        ref.work();  // Manager's method (overridden)
    }
}
