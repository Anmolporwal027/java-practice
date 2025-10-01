class Singleton{

    static private Singleton obj;
    private Singleton(){}
    static Singleton getInstance(){
       //  System.out.println("Instance "+obj);
        if(obj == null){

          obj = new Singleton();  
        }
        return obj;
    }
    int a  = 100;
    static void display(){

        System.out.println("Instance "+obj);
    }
}
class Program2{

    public static void main(String args[]){
        Singleton.display();
        Singleton obj = Singleton.getInstance();
        System.out.println("value : "+obj.a); 
        Singleton obj1 = Singleton.getInstance();
        obj1.a += 100;  
        System.out.println("value : "+obj.a);
        System.out.println("value : "+obj1.a);

    }
}