
class Volume {
    double computeVolume(double side) {  // Cube
        return Math.pow(side, 3);
    }
    
    double computeVolume(double length, double width, double height) {  // Rectangular Box
        return length * width * height;
    }
    
    double computeVolume(double radius, double height) {  // Cylinder
        return Math.PI * radius * radius * height;
    }
    
    public static void main(String[] args) {
        Volume v = new Volume();
        System.out.println("Cube Volume: " + v.computeVolume(3));
        System.out.println("Rectangular Box Volume: " + v.computeVolume(2, 3, 4));
        System.out.println("Cylinder Volume: " + v.computeVolume(3, 5));
    }
}
