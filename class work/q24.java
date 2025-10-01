interface show{
    int show1(int a,int b );
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
        show s = (int a , int b)->{
            return a + b;//with return
        };
        System.out.println(s.show1(2,5));
    }
}