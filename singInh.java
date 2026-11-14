class Person {
    int uid;
    String pname;

    public Person() {
        this(12345, "ABCD");
        System.out.println("Parent class Constructor");
    }

    public Person(int x, String y) {
        uid = x;
        pname = y;
    }
}

class Employee extends Person {
    String occupation;

    public void Enployee(String occup) {
        occupation = occup;
        System.out.println("Child class constructor");
    }

    void display() {
        System.out.println("UID:" + uid);
        System.out.println("Person Name:" + pname);
        System.out.println("Occupation:" + occupation);
    }
}

public class singInh {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}