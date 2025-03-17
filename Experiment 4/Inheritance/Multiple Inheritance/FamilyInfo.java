
class GrandParent {
    void familyName() {
        System.out.println("Family Name: Johnson");
    }
}


class Parent extends GrandParent {
    void displayParentInfo() {
        System.out.println("This is the parent class.");
    }
}


class Child extends Parent {
    void showChildInfo() {
        System.out.println("This is the child class.");
    }
}


public class FamilyInfo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.familyName();       // From GrandParent
        obj.displayParentInfo(); // From Parent
        obj.showChildInfo();    // From Child
    }
}
