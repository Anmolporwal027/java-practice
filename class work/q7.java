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
    BY making the object with same type reference variable compiler already knows that it will run its own method
    Method overriding exists ✅ (because child classes provide their own rate() implementation).

    But polymorphism (runtime binding) is not being demonstrated ❌ because you are not using upcasting (i.e., not using RBI ref = new BOI();).

    isme voh parent class me bhi check karta haii ki method exist karti hai ya nhi
    */
        RBI bref = new BOI(); 
        RBI pref = new PNB();
        RBI sref = new SBI();
        System.out.println("BOI : "+bref.interest());// runtime decides BOI’s interest()
        System.out.println("PNB : "+pref.interest());// runtime decides PNB’s interest()
        System.out.println("SBI : "+sref.interest());// runtime decides SBI’s interest()
    }
}