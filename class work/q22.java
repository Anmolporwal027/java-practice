interface show{
    void show1();
}

class Demo{
    public static void main(String args[]){
        show s = ()->System.out.println("Show ");
        s.show1();
    }
}