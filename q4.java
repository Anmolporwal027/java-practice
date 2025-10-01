/*
2. Aggregation:
Aggregation is a specific type of association that represents a "has-a" relationship, indicating that one class contains or "has" another class. It implies a whole-part relationship, but the "part" object can exist independently of the "whole" object. This means there is no strong ownership, and the lifecycle of the contained object is not dependent on the container object. For example, a Department can "have" Professors. If the Department ceases to exist, the Professors can still exist and potentially join another department.
 */
class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    Teacher teacher;   // Aggregation

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }
}

public class TestMain {
    public static void main(String[] args) {
        Teacher t = new Teacher("Sharma"); // teacher seperately exist karta hai
        Department dept = new Department("Computer Science", t);

        System.out.println("Department: " + dept.deptName);
        System.out.println("Teacher: " + dept.teacher.name);
    }
}
