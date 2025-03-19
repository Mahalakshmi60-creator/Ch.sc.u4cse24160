
class Employee {
    void calculateSalary() {
        System.out.println("Employee salary: $3000");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager salary: $8000");
    }
}

class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer salary: $6000");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee mgr = new Manager();
        Employee dev = new Developer();
        
        emp.calculateSalary();
        mgr.calculateSalary();
        dev.calculateSalary();
    }
}
