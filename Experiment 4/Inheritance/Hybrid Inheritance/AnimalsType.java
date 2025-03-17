
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


interface Pet {
    void friendly();
}

interface Wild {
    void dangerous();
}


class Dog extends Animal implements Pet {
    public void friendly() {
        System.out.println("Dogs are friendly pets.");
    }
    
    void bark() {
        System.out.println("Dog barks.");
    }
}


class Lion extends Animal implements Wild {
    public void dangerous() {
        System.out.println("Lions are dangerous wild animals.");
    }
    
    void roar() {
        System.out.println("Lion roars.");
    }
}


public class AnimalsType {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();       // Inherited from Animal
        myDog.friendly();  // Implemented from Pet
        myDog.bark();      // Specific to Dog
        
        System.out.println("-----------------");

        Lion myLion = new Lion();
        myLion.eat();      // Inherited from Animal
        myLion.dangerous();// Implemented from Wild
        myLion.roar();     // Specific to Lion
    }
}
