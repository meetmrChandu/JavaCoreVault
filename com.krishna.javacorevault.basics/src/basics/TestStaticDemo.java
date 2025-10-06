package basics;

public class TestStaticDemo {
    public static void main(String[] args) {

        StaticDemo.showTotalUsers(); // Called before any object creation

        StaticDemo user1 = new StaticDemo("Krishna");
        user1.greet();

        StaticDemo user2 = new StaticDemo("Chand");
        user2.greet();

        StaticDemo.showTotalUsers(); // Will show 2 now
    }
}
