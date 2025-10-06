package basics;

// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class overriding parent method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle 🎯");
    }
}

// Another child class
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square 🟥");
    }
}
/*
 * Interview Essentials:
 * - Polymorphism means "one name, many forms"
 * - Method overriding enables runtime polymorphism
 * - Decision made at runtime using parent reference and child object
 * - Private, static, and constructors are NOT polymorphic
 * - Real-world: LoggerService (interface) → multiple implementations
 */

// Demo class to showcase runtime polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();  // Parent reference, child object
        s.draw();          // Circle's version runs

        s = new Square();  // Reassigned to different subclass
        s.draw();          // Square's version runs
    }
}
