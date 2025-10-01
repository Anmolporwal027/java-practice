import java.util.Scanner;
// Custom Exception Bnaya hai 
class InsufficientFunds extends Exception{
    InsufficientFunds(String msg){
        super(msg);
    }
}

class Gokuldham{
    int amt;
    Gokuldham(int amt){
        this.amt = amt;
    }
    // Agr exception aaya to ye method iske caller pr fek degi 
    void party(int bgt) throws InsufficientFunds{
        if(amt < bgt){
            // exception aaya to isne fek diya apne custom message de kr exception object ke andr
            throw new InsufficientFunds("Paise nhi hai bhai ");
        }else{
            System.out.println("Budget hai party ho jayegi !!");
        }
    }
}
class Q13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Gokuldham g = new Gokuldham(50000);
        System.out.println("Budget of program ");
        int bgt = sc.nextInt();
        try{
            g.party(bgt);   
        }catch(InsufficientFunds e){
            System.out.println("Exception : "+e.getMessage());
        }

    }
}