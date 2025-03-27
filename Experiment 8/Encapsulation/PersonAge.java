class Person {
    private String name;  
    private int age;      

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}

public class PersonAge {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person.getName());  
        person.setName("Doe");
        System.out.println(person.getName());  
    }
}

