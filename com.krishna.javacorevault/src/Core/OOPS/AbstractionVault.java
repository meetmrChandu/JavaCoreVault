package Core.OOPS;

/*
 🔒 JavaCoreVault Entry: ABSTRACTION
 ----------------------------------
 🧠 Concept Summary:
 Abstraction is the process of hiding implementation details 
 and showing only essential information to the user.

 In Java, abstraction is achieved using:
   1️⃣ Abstract Classes  → Partial Abstraction (can have implemented + unimplemented methods)
   2️⃣ Interfaces        → Full Abstraction (until Java 7), enhanced in Java 8+ with default & static methods

 📘 Real World Example:
   - A driver uses a car (presses pedals, turns wheel) without knowing how the engine works.
   - A user makes a payment online without seeing internal payment processing.
*/

// ✅ Abstract Class Example
abstract class PaymentProcessor {

    // Abstract method — must be implemented by subclass
    abstract void processPayment(double amount);

    // Concrete method — provides common reusable behavior
    void paymentInfo() {
        System.out.println("Payments must be secure and verified.");
    }
}

// Concrete subclass implementing the abstract method
class CreditCardPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class UpiPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

// ✅ Interface Example
interface Notification {
    void sendNotification(String message);
}

// Class implementing the interface
class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}

public class AbstractionVault {
    public static void main(String[] args) {
        // Using abstract class
        PaymentProcessor upi = new UpiPayment();
        upi.processPayment(1500);
        upi.paymentInfo();

        // Using interface
        Notification sms = new SmsNotification();
        sms.sendNotification("Payment successful!");

        // Using another implementation
        PaymentProcessor card = new CreditCardPayment();
        card.processPayment(2500);
    }
}

/*
 🧩 INTERVIEW INSIGHTS
 ---------------------
 1️⃣ What is abstraction in Java?
     → Hiding internal implementation and exposing only essential features.

 2️⃣ How to achieve abstraction?
     → Using abstract classes or interfaces.

 3️⃣ Can abstract class have constructors?
     → Yes, for initializing common fields in subclasses.

 4️⃣ Difference between abstract class and interface?
     → Abstract class supports partial abstraction (can have state).
        Interface supports multiple inheritance and is meant for defining behavior contracts.

 5️⃣ Can an interface have a constructor?
     → No, because interfaces cannot be instantiated.

 6️⃣ What if a class doesn’t implement all methods of an interface?
     → It must be declared abstract.

 7️⃣ Why are interfaces used over abstract classes in some cases?
     → For defining shared behavior contracts across unrelated classes.

 💡 Did You Know?
   - Java 8 introduced 'default' and 'static' methods in interfaces.
   - Java 9 introduced 'private' methods inside interfaces for reuse within the interface itself.

 🧠 Revision Mnemonic:
   Abstract Class = Blueprint with base behavior.
   Interface = Contract of what must be done.
*/
