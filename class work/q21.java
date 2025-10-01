interface show{
    void show1();
}

class Demo{
    public static void main(String args[]){
        show s = new show(){
            public void show1(){
                System.out.println("Show");
            }
        };
        s.show1();
    }
}