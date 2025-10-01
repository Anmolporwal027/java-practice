// constructor overloading
class TestMain{
    TestMain(int a, int b){
        System.out.println("Greater number is : ... "+((a>b)?a:b));
    }
    TestMain(int a , int b , int c){
        System.out.println("Greater number is : "+((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c)));
    }
    public static void main(String args[]){
        TestMain t = new TestMain(1,2);
        TestMain t1 = new TestMain(1,2,3);
    }
}