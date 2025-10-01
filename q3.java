/*
1. Association:
Association represents a general relationship between two classes. It signifies that objects of one class are connected to objects of another class and can interact. This relationship can be one-to-one, one-to-many, many-to-one, or many-to-many. There is no implied ownership or lifecycle dependency between the associated objects. For example, a Student and a Course can be associated; a student can take multiple courses, and a course can have multiple students. 
 */
class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class TestMain {
    public static void main(String[] args) {
        Teacher t = new Teacher("Sharma");
        Student s = new Student("Anmol");

        // Association (link between object)
        System.out.println(s.name + " is taught by " + t.name);
    }
}
