// Arithmetic exception and null pointer
class Q2{
    int num;
    public static void main(String args[]){
        try{
        Q2 obj = null;
        obj.num = 123;
        int a = 10;
        int b = 0;
        int c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Exception comes : "+e);
        }catch(NullPointerException e){
            System.out.println("null pointer Excetion comes : "+e);
        }
    }
}