
class Shape {
    double area(double radius) {  // Circle
        return Math.PI * radius * radius;
    }
    
    double area(double length, double width) {  // Rectangle
        return length * width;
    }
    
    double area(int base, int height) {  // Triangle
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Circle Area: " + shape.area(5));
        System.out.println("Rectangle Area: " + shape.area(4, 6));
        System.out.println("Triangle Area: " + shape.area(3, 7));
    }
}
