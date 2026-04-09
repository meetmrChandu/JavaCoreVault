package Core.Interfaces;

interface Vehicle {
    int MAX_SPEED = 180; // public static final by default

    void start(); // public abstract by default
    void stop();

    default void displayBrand() {
        System.out.println("Generic Vehicle Brand");
    }

    static void showMaxSpeed() {
        System.out.println("Max speed allowed: " + MAX_SPEED);
    }
}
