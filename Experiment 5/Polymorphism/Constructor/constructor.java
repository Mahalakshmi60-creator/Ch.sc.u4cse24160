class Student {
    String name;
    int rollNo;

    
    Student(String studentName, int studentRollNo) {
        name = studentName;
        rollNo = studentRollNo;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        s1.display();
    }
}