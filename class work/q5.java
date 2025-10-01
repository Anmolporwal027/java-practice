class Parent{
    void show(){
        System.out.println("Its shape");
    }
}
class Circle extends Parent{
    @Override
    void show(){
        System.out.println("Its circle shape");
    }
}
class Rectangle extends Parent{
    @Override
    void show(){
        System.out.println("Its rectangle shape");
    }
}
class Square extends Parent{

}
class TestMain{
    public static void main(String args[]){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        c.show();
        r.show();
        s.show();
    }
}