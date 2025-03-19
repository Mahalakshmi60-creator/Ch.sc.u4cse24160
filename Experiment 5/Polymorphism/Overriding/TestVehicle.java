
class Vehicle {
    void maxSpeed() {
        System.out.println("Vehicle speed is 60 km/h");
    }
}

class Car extends Vehicle {
    void maxSpeed() {
        System.out.println("Car speed is 200 km/h");
    }
}

class Bike extends Vehicle {
    void maxSpeed() {
        System.out.println("Bike speed is 120 km/h");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myVehicle.maxSpeed();
        myCar.maxSpeed();
        myBike.maxSpeed();
    }
}
