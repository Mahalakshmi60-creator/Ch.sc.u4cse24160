
class StringManipulator {
    String concat(String a, String b) {
        return a + b;
    }
    
    String concat(String a, String b, String c) {
        return a + b + c;
    }
    
    String concat(String a, int num) {
        return a + num;
    }
    
    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();
        System.out.println(sm.concat("Hello", " World"));
        System.out.println(sm.concat("Java", " is", " fun"));
        System.out.println(sm.concat("Number: ", 100));
    }
}
