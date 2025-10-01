// Method overloading in java

class TestMain{
    void sum(int a , int b){
        System.out.println("Sum : "+(a+b));
    }
    void sum(float a, float b){
        System.out.println("Sum : "+(a+b));
    }
    public static void main(String args[]){
        TestMain t = new TestMain();
        t.sum(2.3f,4.7f);
        t.sum(3,4);
    }
}