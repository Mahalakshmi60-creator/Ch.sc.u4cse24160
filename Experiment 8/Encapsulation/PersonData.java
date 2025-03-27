class Vehicle {
    private String make;
    private String model;

    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    
    public void setMake(String make) {
        this.make = make;
    }

    
    public void setModel(String model) {
        this.model = model;
    }

    
    public String getVehicleInfo() {
        return make + " " + model;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Toyota", "Corolla");

        
        car.setMake("Honda");
        car.setModel("Civic");

        System.out.println(car.getVehicleInfo());  
    }
}

