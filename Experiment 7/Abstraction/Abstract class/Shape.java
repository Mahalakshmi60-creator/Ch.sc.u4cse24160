abstract class Example {
    Animal() {
        System.out.println("Animal is created.");
    }

    abstract void sound();
}

class Lion extends Example {
    void sound() {
        System.out.println("Lion roars: Roar Roar!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.sound();
    }
}




