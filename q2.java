import java.util.Scanner;
class Account{
    int aNo;
    String name;
    Account(int aNo, String name){
        this.aNo = aNo;
        this.name = name;
    }
    void getAcc(){
        System.out.println("Your acc no "+aNo);
        System.out.println("Account holder name "+name);
    }

}
class Balance extends Account{
    int balance;
    Balance(int aNo,String name,int balance){
        super(aNo,name);
        this.balance = balance;
    }
    int getBal(){
        getAcc();
        return balance;
    }

}
class Transaction extends Balance{
    int deposit;
    int withdrawl;
    Transaction(int aNo,String name,int balance,int deposit,int withdrawl){
        super(aNo,name,balance);
        this.deposit = deposit;
        this.withdrawl = withdrawl;
    }
    void getTransaction(){
        getBal();
        System.out.println("Deposited amount "+deposit);
        balance += deposit;
        System.out.println("Withdrawal amount "+withdrawl);
        balance -= withdrawl;
        System.out.println("Balance after the transaction is "+balance);
    }
}
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account no ");
        int aNo = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter account holder name ");
        String name = sc.nextLine();

        System.out.println("Enter your balance amount ");
        int balance = sc.nextInt();

        System.out.println("Enter your deposit amount ");
        int deposit = sc.nextInt();

        System.out.println("Enter your withdrawl amount ");
        int withdrawl = sc.nextInt();

        Transaction t = new Transaction(aNo,name,balance,deposit,withdrawl);
        t.getTransaction();

    }
}