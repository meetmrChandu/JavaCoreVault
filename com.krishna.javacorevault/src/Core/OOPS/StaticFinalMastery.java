package Core.OOPS;

/*
 🔒 JavaCoreVault: Mastering Static & Final
 ------------------------------------------
 🧠 Concept Summary:

 1️⃣ Static:
 - Belongs to the class, not instance
 - Shared across all objects
 - Types:
   • Static Variable → one copy per class
   • Static Method → can be called without object
   • Static Block → executes when class is loaded

 2️⃣ Final:
 - Used to define constants, prevent inheritance, and stop method overriding
 - Types:
   • Final Variable → value cannot change
   • Final Method → cannot be overridden
   • Final Class → cannot be extended

 📘 Why combined?
 - Frequently asked together in interviews to check understanding of **class-level behavior vs immutability**.
*/

class StaticFinalDemo {

    // Static variable
    static int count = 0;

    // Final variable (constant)
    final double RATE = 7.5;

    // Static block
    static {
        System.out.println("Static block executed: class loaded");
    }

    // Static method
    static void incrementCount() {
        count++;
        System.out.println("Static variable count = " + count);
    }

    // Final method
    final void showRate() {
        System.out.println("Final variable RATE = " + RATE);
    }
}

// Final class
final class Constants {
    static final double PI = 3.14159;
}

public class StaticFinalMastery {
    public static void main(String[] args) {
        // Using static members
        StaticFinalDemo.incrementCount();
        StaticFinalDemo.incrementCount();

        // Using final members
        StaticFinalDemo obj = new StaticFinalDemo();
        obj.showRate();

        // Access final class constant
        System.out.println("Final class constant PI = " + Constants.PI);
    }
}

/*
 🧩 Did You Know?
 - Static methods cannot access non-static members directly
 - Final variables must be initialized once
 - Static block executes once at class load
 - Final class cannot be subclassed
 - Final method prevents overriding for security and consistency

 🧠 Interview Q&A:
 1️⃣ Can static methods be overridden? → No, they can be hidden by subclass
 2️⃣ When is a static block executed? → During class loading
 3️⃣ Can a final variable be left uninitialized? → Yes, must initialize in constructor or inline
 4️⃣ Difference between final, finally, and finalize? → Common interview trap
 5️⃣ Can main method be non-static? → Yes, using reflection, but uncommon
 6️⃣ Why combine static + final in interview questions? → Tests understanding of **shared state vs immutability**
*/

