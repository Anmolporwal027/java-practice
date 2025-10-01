/*
2. getClass()

Returns the runtime class object of an instance.

Useful for reflection or debugging.
*/
class Student {}

class Q4{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getClass());  
        // Output: class Student
    }
}



// // example showing the concept of Object class methods | getClass() method
// class Q4{
//     public static void main(String args[]){
//         /*
//             // Object obj = new String();
//             String obj = new String();
//             Class c = obj.getClass();
//             System.out.println("class name : "+c.getName());
//         */

//         //    System.out.println("class name : "+new String().getClass().getName());
        
//             Demo4 obj = new Demo4();
//             Class c = obj.getClass();
//             System.out.println("class with class name : "+c);
//             System.out.println("class name : "+c.getName());
        
//     }
// }
