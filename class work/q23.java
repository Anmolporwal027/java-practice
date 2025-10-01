interface show{
    void show1();
}

class Demo{
    Demo(){
        System.out.println("Demo constructor");
    }
    void show(){
        System.out.println("SHow method of demo");
    }
    void move(){
        System.out.println("Mobe method called");
    }
    public static void main(String args[]){
        show s = ()->{
            System.out.println("Show ");
            Demo d = new Demo();
            d.show();
        };
        s.show1();
    }
}