interface show{
    void show1();
}
class Demo1 implements show{
    @Override
    public void show1(){
        System.out.println("Show !");
    }
}
class Demo{
    public static void main(String args[]){
        Demo1 d = new Demo1();
        d.show1();
    }
}