class Bank{
    int bal;
    Bank(int bal){
        this.bal = bal;
    }
    synchronized void withdraw(int amt){
        try{
            if(amt > bal){
                System.out.println("Wait for Deposit");
                wait();
            }
            System.out.println("Total balance : "+bal);
            System.out.println("Withdrawl Amount : "+amt);
            bal -= amt;
            System.out.println("Remaining Amount : "+bal);
        }
        catch(InterruptedException e){
            System.out.println("Exception "+e);
        }
    }
    synchronized void deposit(int amt){
            System.out.println("Amount Deposited Successfully ");
            System.out.println("Deposited Amount : "+amt);
            this.bal += amt;
            System.out.println("Total balance : "+(bal));
            notify();
    }
}
class Demo16{
    public static void main(String args[]){
        int bal = 10000;
        int with = 15000;
        int depo = 10000;

        Bank b = new Bank(bal);
        Thread th = new Thread(){
            @Override 
            public void run(){
                b.withdraw(with);
            }
        };
        th.start();

        Thread th1 = new Thread(){
            @Override 
            public void run(){
                b.deposit(depo);
            }
        };
        th1.start();

    }
}