
abstract class Employee {
    abstract void calculateSalary();
}


class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager Salary: $8000");
    }
}


class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer Salary: $6000");
    }
}


public class TestEmployee {
    public static void main(String[] args) {
        Employee mgr = new Manager();
        Employee dev = new Developer();
        
        mgr.calculateSalary();
        dev.calculateSalary();
    }
}
