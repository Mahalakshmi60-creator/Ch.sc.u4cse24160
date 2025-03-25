abstract class Example {
    abstract void speed(); // Abstract method

    void fuel() { // Concrete method
        System.out.println("Vehicle uses fuel.");
    }
}

class Car extends Example {
    void speed() {
        System.out.println("Car speed is 100 km/h.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
        c.fuel();
    }
}





