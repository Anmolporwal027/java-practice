// Nested Class static
class Outer{
    static int b = 20;

    void display(){
        System.out.println("Outer class");
    }
    // static inner class koi bhi variable accept nhi kar sakti hai
    static class Inner{
        Inner(){
            System.out.println("Inner class constructor"+b);
        }
    }
    // public static void main(String args[]){
    //     // Outer.Inner obj2 = new Outer.Inner();
    //     new Inner();
    // }
}
class TestMain{
    public static void main(String args[]){
        Outer.Inner obj = new Outer.Inner();
    }
}
