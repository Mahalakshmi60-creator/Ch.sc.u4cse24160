interface Example {
    void call();

    default void message() {
        System.out.println("Sending a default message...");
    }
}

class Smartphone implements Example {
    public void call() {
        System.out.println("Making a call...");
    }
}

public class Mobile {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.call();
        phone.message();
    }
}


