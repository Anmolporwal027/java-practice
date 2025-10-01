// Deep copy
class Address{
    String city;
    String state;
    Address(String city , String state){
        this.city = city;
        this.state = state;
    }
}

class Student{
    int rno;
    String name;
    Address a;
    Student(int rno,String name,Address a){
        this.rno = rno;
        this.name = name;
        this.a = a;
    }
    Student(Student s1){
        this.rno = s1.rno;
        this.name = s1.name;
        this.a = new Address(s1.a.city,s1.a.state);
    }
}
class TestMain{
    public static void main(String args[]){
        Address a = new Address("indore","MP");
        Student s1 = new Student(01,"Rjaja",a);
        Student s2 = new Student(s1);

        System.out.println("BEfore");
        System.out.println("Student 1 ");
        System.out.println("Roll no : "+s1.rno+" name : "+s1.name+" city : "+s1.a.city+" state : "+s1.a.state);
        System.out.println("Student 2 ");
        System.out.println("Roll no : "+s2.rno+" name : "+s2.name+" city : "+s2.a.city+" state : "+s2.a.state);

        s2.a.state = "Hp";
        s2.a.city = "haldwani";


        System.out.println("After");
         System.out.println("Student 1 ");
        System.out.println("Roll no : "+s1.rno+" name : "+s1.name+" city : "+s1.a.city+" state : "+s1.a.state);
        System.out.println("Student 2 ");
        System.out.println("Roll no : "+s2.rno+" name : "+s2.name+" city : "+s2.a.city+" state : "+s2.a.state);

    }
}