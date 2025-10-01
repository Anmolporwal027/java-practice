/*
Defined in Object class.

Returns a string representation of the object.

By default, it gives:
ClassName@HexadecimalHashCode
but we always override it to get our output like also in exception handeling
 exception class is overriding to string method to show the exception
*/

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "ID : "+id+" Name : "+name;
    }
}
class Q1{
    public static void main(String args[]){
        Student s1 = new Student(1,"Anmol");
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}