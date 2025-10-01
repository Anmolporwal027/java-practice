//making custom exception
// throw keyword is used to throw an exception explicitly with our own message
class Q5{
    int balance;
    int withdraw;
    Q5(int balance , int withdraw){
        this.balance = balance;
        this.withdraw = withdraw;
    }
    void Bank(){
        if(balance < withdraw)
            throw new ArithmeticException("Insufficient Balance!");
        else
            System.out.println("Amount Withdrawn Successfully ");
    }
    public static void main(String args[]){
        Q5 obj = new Q5(1000,2000);
        try{
            obj.Bank();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }    
    }
}