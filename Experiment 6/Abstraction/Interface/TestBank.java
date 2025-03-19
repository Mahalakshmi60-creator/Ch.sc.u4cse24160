
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements BankAccount {
    double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}


public class TestBank {
    public static void main(String[] args) {
        BankAccount myAccount = new SavingsAccount();
        myAccount.deposit(500);
        myAccount.withdraw(1200);
    }
}
