class Vehicle {
    String brand = "Generic Brand";
}

class Car extends Vehicle {
    int doors = 4;

    void showCarDetails() {
        System.out.println("Car Brand: " + brand + ", Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasCarrier = false;

    void showBikeDetails() {
        System.out.println("Bike Brand: " + brand + ", Has Carrier: " + hasCarrier);
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        Car c = new Car();
        c.showCarDetails();

        Bike b = new Bike();
        b.showBikeDetails();
    }
}
