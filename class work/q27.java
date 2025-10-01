import java.util.Scanner;
abstract class RBI{
    abstract double rate();
    double finalSum(int balance , double rate){
        return balance + balance * rate/100;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 1.2;
    }
}
class SBI extends RBI{
    @Override
    double rate(){
        return 1.5;
    }
}
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance");
        int balance = sc.nextInt();
        RBI obj = new BOI();
        System.out.println("Balance after rate "+obj.finalSum(balance,obj.rate()));
        obj = new SBI();
        System.out.println("Balance after rate of sbi "+obj.finalSum(balance,obj.rate()));
    }
}