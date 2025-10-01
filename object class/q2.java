/*
📌 hashCode() Method
🔹 What it does

Returns an integer hash value for the object.

Used mostly in hash-based collections (HashMap, HashSet, Hashtable).

By default: hashCode() returns a value based on the object’s memory address.
*/

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return id;
    }
}
class Q2{
    public static void main(String args[]){
        Student s1 = new Student(1,"Anmol");
        System.out.println(s1.hashCode());
    }
}