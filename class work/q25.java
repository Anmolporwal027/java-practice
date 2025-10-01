interface show{
    int show1(int a,int b );
}

class Demo{
    public static void main(String args[]){
        show s = (a,b)->a + b;
        System.out.println(s.show1(2,5));
    }
}