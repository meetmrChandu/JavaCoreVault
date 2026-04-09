package Core.OOPS;

/*
====================================================
📘 JavaCoreVault: Encapsulation.java
====================================================

🧩 THEORY:
Encapsulation in Java means binding data (variables) and methods into a single unit (class) 
and restricting direct access to the data using access modifiers (mostly 'private').

It provides:
✅ Data security (prevents unauthorized access)
✅ Code flexibility (internal changes don’t affect external code)
✅ Data validation (through setter methods)

Steps to achieve Encapsulation:
1️⃣ Make data members private.
2️⃣ Provide public getters and setters to access/modify data safely.

----------------------------------------------------
💻 EXAMPLE:
----------------------------------------------------
*/

public class Encapsulation {

    // Private variables - not accessible directly from outside
    private String username;
    // private String password;

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username (with validation)
    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Invalid username!");
        }
    }

    // Getter for password (masked)
    public String getPassword() {
        return "******"; // never expose password directly
    }

    // Setter for password (with validation)
    public void setPassword(String password) {
        if (password.length() >= 6) {
            // this.password = password;
        } else {
            System.out.println("Password too short!");
        }
    }

    public static void main(String[] args) {
        Encapsulation user = new Encapsulation();
        user.setUsername("Chandu");
        user.setPassword("secure123");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}

/*
----------------------------------------------------
💡 DID YOU KNOW?
----------------------------------------------------
- Encapsulation is also called “data hiding”.
- JavaBeans follow encapsulation via private fields + public getters/setters.
- Encapsulation promotes loose coupling and code maintainability.
- Access modifiers (private, protected, public) are tools of encapsulation.
- Real-life analogy: ATM → user accesses cash (public) but cannot see internal logic (private).

----------------------------------------------------
🎯 INTERVIEW Q&A
----------------------------------------------------
Q1: What is encapsulation?
👉 Wrapping data and methods in a class while restricting direct access to the data.

Q2: How is encapsulation implemented in Java?
👉 By making variables private and providing getters/setters.

Q3: How is it different from abstraction?
👉 Encapsulation hides data; abstraction hides implementation logic.

Q4: What are benefits of encapsulation?
👉 Security, flexibility, code reusability, maintainability.

Q5: Can you access private members outside the class?
👉 No, unless through getters/setters or reflection (not recommended).

====================================================
*/

