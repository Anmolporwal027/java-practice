abstract class Demo{
    abstract void show();
} 
class TestMain extends Demo{
    @Override
    void show(){
        System.out.println("Show method");
    }
    public static void main(String args[]){
        TestMain t = new TestMain();
        t.show();
    }
}