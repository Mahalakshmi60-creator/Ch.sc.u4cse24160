class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.showBrand();
    }
}