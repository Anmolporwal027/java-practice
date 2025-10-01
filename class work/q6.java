class RBI{
    double interest(){
        return 1.2;  
    }
}
class BOI extends RBI{
    @Override
    double interest(){
        return 3.2;
    }
}
class PNB extends RBI{
    @Override
    double interest(){
        return 1.98;
    }
}
class SBI extends RBI{

}
class TestMain{
    public static void main(String args[]){
        
    /*
    Without upcasting, if a reference variable's type always matches the object's actual type, then method calls would be resolved at compile time (static binding) rather than at runtime. This would eliminate the core concept of runtime polymorphism, which allows the specific method implementation to be determined based on the actual object type at the time of invocation.

    BY making the object with same type reference variable compiler already knows that it will run its own method
    Method overriding exists ✅ (because child classes provide their own interest() implementation).

    But polymorphism (runtime binding) is not being demonstrated ❌ because you are not using upcasting (i.e., not using RBI ref = new BOI();).
    */
        BOI b = new BOI(); 
        PNB p = new PNB();
        SBI s = new SBI();
        System.out.println("BOI : "+b.interest());
        System.out.println("PNB : "+p.interest());
        System.out.println("SBI : "+s.interest());
    }
}