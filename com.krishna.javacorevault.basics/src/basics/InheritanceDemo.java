package basics;

// Demonstrates basic inheritance in Java

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car horn blows");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited method
        myCar.honk();   // Car's own method
    }
}
