import java.util.Scanner;
class Q3{
    static void divide(int a,int b){
        try{
            int c=a/b;
            System.out.println("Division : "+c);
        }
        catch(Exception e){
            System.out.println("Exception "+e);
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("\nEnter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            divide(a,b);
        }
    }
}