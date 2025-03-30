class ExceptionExample {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Access Denied: Age must be 18 or above.");
        } else {
            System.out.println("Access Granted.");
        }
    }
}

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            ExceptionExample.checkAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}









