package Core.Interfaces;

class Car implements Vehicle, Electric {
    private String brand;

    Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " has stopped.");
    }

    @Override
    public void charge() {
        System.out.println(brand + " is charging its battery.");
    }

    @Override
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class InterfaceVault {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla");
        tesla.start();
        tesla.charge();
        tesla.displayBrand();
        tesla.stop();

        Vehicle.showMaxSpeed(); // Static method call from interface
    }
}
