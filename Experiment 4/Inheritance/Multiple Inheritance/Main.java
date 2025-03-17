class Animal {
    String species = "General Animal";
}

class Mammal extends Animal {
    boolean isWarmBlooded = true;
}

class Dog extends Mammal {
    String breed = "Labrador";

    void showDetails() {
        System.out.println("Species: " + species);
        System.out.println("Warm-blooded: " + isWarmBlooded);
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showDetails();
    }
}
