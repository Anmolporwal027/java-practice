class Student{
    int age;
    // no argument
    Student(){
        System.out.println("NO argument constructor");
    }
    // parameterized
    Student(int age){
        this.age = age;
    }
    // copy
    Student(Student obj1){
        this.age = obj1.age;
    }

    void displayAge(){
        System.out.println(age);
    }

}
class TestMain{
    public static void main(String args[]){
        Student obj = new Student();
        Student obj1 = new Student(13);
        Student obj2 = new Student(obj1);
        obj.displayAge();
        obj1.displayAge();
        obj2.displayAge();
    }
}