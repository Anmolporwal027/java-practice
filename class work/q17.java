// Nested Class
class Outer{
    int a = 10;
    static int b = 20;
    private int c = 30;
    void display(){
        System.out.println("Outer class");
    }
    // non static inner class koi bhi variable accept kar sakti hai
    class Inner{
        Inner(){
            System.out.println("Inner class constructor"+a+"\t"+b+"\t"+c);
        }
    }
    public static void main(String args[]){
        // Outer obj1 = new Outer();
        // Outer.Inner obj = obj1.new Inner();
        
        Outer.Inner obj2 = new Outer().new Inner();
    }
}
