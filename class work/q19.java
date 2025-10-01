class Outer1{
    static int b = 20;

    void display(){

        class Inner1{
            Inner1(){
                System.out.println("Inner class constructor"+b);
            }
        }

        System.out.println("Outer class");

        Inner1 i = new Inner1();
    }
}
class TestMain1{
    public static void main(String args[]){
        Outer1 obj = new Outer1();
        obj.display();
    }
}
