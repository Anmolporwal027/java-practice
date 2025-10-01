class Student{
    int age;
    // no argument
    Student(){
        System.out.println("NO argument constructor");
    }
    Student(int age){
        this.age = age;
    }
    void displayAge(){
        System.out.println(age);
    }

}
class TestMain{
    public static void main(String args[]){
        Student obj = new Student(12);
        Student obj1 = new Student(13);
        obj.displayAge();
        obj1.displayAge();
    }
}