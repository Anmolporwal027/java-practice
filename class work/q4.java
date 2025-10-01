// method overriding 
// here we achieve 
class Parent{
    void show(){
        System.out.println("Parent show called");
    }
}
class Child extends Parent{
    @Override //annotation
    void show(){
        System.out.println("Child show called");
    }
}
class TestMain{
    public static void main(String args[]){
        Child c = new Child();
        c.show();
    }
}