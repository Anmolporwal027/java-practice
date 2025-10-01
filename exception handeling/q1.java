// Arithmetic exception 
class q1{
    static void calculate(){
        int a = 10;
        int b = 0;
        try{
            System.out.println("Division : "+(a/b));
        }catch(ArithmeticException e){
            System.out.println("Excetion comes : "+e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        calculate();
    }
}