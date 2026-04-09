/*
 * ================================================
 * 📘 JavaCoreVault: WrapperClassesDemo.java
 * Topic: Mastering Wrapper Classes in Java
 * ================================================
 *
 * 🧠 THEORY SECTION:
 * -------------------
 * 1️⃣ What are Wrapper Classes?
 *   - Wrapper classes are object representations of primitive types.
 *   - They allow primitives to be used in Collections, Generics, and APIs expecting Objects.
 *
 *   Primitive → Wrapper mapping:
 *   byte → Byte
 *   short → Short
 *   int → Integer
 *   long → Long
 *   float → Float
 *   double → Double
 *   char → Character
 *   boolean → Boolean
 *
 * 2️⃣ Autoboxing and Unboxing:
 *   - Autoboxing: automatic conversion from primitive → wrapper.
 *   - Unboxing: automatic conversion from wrapper → primitive.
 *
 *   Example:
 *     int a = 5;
 *     Integer obj = a;     // Autoboxing
 *     int b = obj;         // Unboxing
 *
 * 3️⃣ Common Methods:
 *   - parseXxx(String s): converts String → primitive.
 *   - valueOf(String s): converts String → Wrapper object.
 *   - xxxValue(): extracts primitive value.
 *   - equals(), compareTo(): compare wrapper objects.
 *
 * 4️⃣ Integer Caching (Important!):
 *   - Java caches Integer objects from -128 to +127.
 *   - Values within this range refer to the same object.
 *     Integer i1 = 100, i2 = 100 → (i1 == i2) true
 *     Integer i3 = 200, i4 = 200 → (i3 == i4) false
 *
 * 5️⃣ Immutability:
 *   - All wrapper classes are immutable and final.
 *   - Once created, the wrapped value cannot be changed.
 *
 * -----------------------------------------------
 * ⚙️ INTERVIEW INSIGHTS:
 * -----------------------------------------------
 * 💬 Q1: Difference between == and equals()?
 *      → '==' checks reference; '.equals()' checks value.
 *
 * 💬 Q2: Can null be unboxed?
 *      → No, it throws NullPointerException.
 *
 * 💬 Q3: How does autoboxing affect performance?
 *      → Can cause unnecessary object creation in loops.
 *
 * 💬 Q4: Why are wrapper classes immutable?
 *      → To ensure consistency and thread safety.
 *
 * 💬 Q5: Why is caching limited to -128 to +127?
 *      → It improves memory efficiency for frequently used numbers.
 *
 * -----------------------------------------------
 * ⚡ "Did You Know?"
 * -----------------------------------------------
 * Wrapper objects are also used by reflection and annotations at runtime!
 * ================================================
 */

package Core.OOPS;

public class WrapperClassesDemo {

    public static void main(String[] args) {

        // --- Autoboxing and Unboxing ---
        int a = 10;
        Integer boxed = a; // autoboxing
        int unboxed = boxed; // unboxing
        System.out.println("Autoboxed: " + boxed + ", Unboxed: " + unboxed);

        // --- Common Methods ---
        Integer x = Integer.valueOf("25");
        int y = Integer.parseInt("25");
        System.out.println("valueOf() gives: " + x + ", parseInt() gives: " + y);

        System.out.println("compareTo(30): " + x.compareTo(30)); // -1
        System.out.println("equals(25): " + x.equals(25));       // true

        // --- Integer Caching Example ---
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i1 == i2 : " + (i1 == i2)); // true (cached)
        System.out.println("i3 == i4 : " + (i3 == i4)); // false (new objects)

        // --- Null unboxing test (⚠️ Dangerous, uncomment to test) ---
        // Integer n = null;
        // int z = n; // Throws NullPointerException
    }
}
