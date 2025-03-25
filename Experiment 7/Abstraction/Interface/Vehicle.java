interface Example {
    void start();
}

class Car implements Example {
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike implements Example {
    public void start() {
        System.out.println("Bike starts with a kick.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}

