
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " eats food.");
    }
}


class Dog extends Animal {
    Dog(String name) {
        super(name); // Calling parent constructor
    }

    void bark() {
        System.out.println(name + " barks.");
    }
}


class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " meows.");
    }
}


class Cow extends Animal {
    Cow(String name) {
        super(name);
    }

    void moo() {
        System.out.println(name + " moos.");
    }
}


public class AnimalDetails {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Specific to Dog

        System.out.println("-----------------");

        Cat myCat = new Cat("Whiskers");
        myCat.eat();  // Inherited from Animal
        myCat.meow(); // Specific to Cat

        System.out.println("-----------------");

        Cow myCow = new Cow("Daisy");
        myCow.eat();  // Inherited from Animal
        myCow.moo();  // Specific to Cow
    }
}
