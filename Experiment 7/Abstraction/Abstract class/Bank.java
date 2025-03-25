abstract class Example {
    abstract void rateOfInterest();
}

class SBI extends Example {
    void rateOfInterest() {
        System.out.println("SBI Rate of Interest: 5.4%");
    }
}

class HDFC extends Example {
    void rateOfInterest() {
        System.out.println("HDFC Rate of Interest: 6.1%");
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.rateOfInterest();
        b2.rateOfInterest();
    }
}






