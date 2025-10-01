/*
1. equals(Object obj)

Purpose: To compare two objects for logical equality.

By default, equals() in Object class compares memory addresses (like ==).

But classes can override it to compare object contents.
*/

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object s){
        if(this == s)
            return true;
        else
            return false;
    }
}
class Q3{
    public static void main(String args[]){
        Student s1 = new Student(1,"Anmol");
        Student s2 = new Student(2,"Anni");
        System.out.println(s1.equals(s2));
    }
}


