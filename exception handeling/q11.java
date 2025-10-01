class Q11 {
    static void show() throws ClassNotFoundException{
        // Try loading a class
        try {
            Class.forName("Student");  // If Student class not found, JVM throws exception
        } catch (ClassNotFoundException ex) {
            // Throwing our own custom exception with message
            throw new ClassNotFoundException("Class hai hi nhi bhai!!");
        }
    }

    public static void main(String args[]) {
        try {
            show();
        } catch (ClassNotFoundException e) {
            System.out.println("Used using throws: " + e);
        } finally {
            System.out.println("Finally executes");
        }
    }
}
