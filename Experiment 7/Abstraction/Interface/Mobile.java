abstract class 	Example {
    abstract void draw(); // Abstract method
}

class Circle extends Example {
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle extends Example{
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

public class Shape {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}



