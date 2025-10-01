class Singleton{

    static final private Singleton obj = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return obj;
    }
    int age = 18;
    static void display(){

        System.out.println("Instance "+obj);
    }
}
class Program1{

    public static void main(String args[]){
        Singleton.display();
        Singleton obj = Singleton.getInstance();
        System.out.println("Age : "+obj.age);    

    }
}