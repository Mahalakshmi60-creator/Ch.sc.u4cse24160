interface Example {
    void makeSound();
}

class Dog implements Example {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat implements Example {
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}
