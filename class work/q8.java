// Is-a and Has-a in aggregation
class Engine{
    int hp;
    Engine(int hp){
        this.hp = hp;
    }
}
class Car{
    String color; 
    int price;
    
    void SetData(String color,int price){
        this.color = color;
        this.price = price;
    }
}
class Maruti extends Car{
    Engine e;
    Maruti(String color,int price, Engine e){
        SetData(color,price);
        this.e = e;
    }
    void getData(){
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
        System.out.println("Engine : "+e.hp);
    }
}
class TestMain{
    public static void main(String args[]){
        Engine e = new Engine(200);
        Maruti m = new Maruti("blue",50000,e);
        m.getData();
    }
}