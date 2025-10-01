/*
The finalize() method belongs to the Object class.

Its job is to give an object a last chance to clean up resources before the Garbage Collector (GC) destroys it.

In other words:
👉 When an object is no longer referenced and is about to be collected by the JVM’s garbage collector, the finalize() method is called automatically (once), if it’s overridden in your class.

By making it protected, Java ensures outside classes cannot misuse it.

But subclasses can override it to define custom cleanup logic.

s1 = null;         // Student object becomes eligible for GC
System.gc();       // Request GC (not immediate)
System.out.println("End of program");  // Main thread continues
// Sometime later... GC thread runs and calls finalize()

*/
class Student {
    @Override
    protected void finalize() {
        System.out.println("Finalize method called: Object is about to be destroyed");
    }
}

class Q5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1 = null; // Now object is eligible for GC

        System.gc();  // Request garbage collection

        System.out.println("End of program");
    }
}
