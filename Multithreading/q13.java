// synchronized → avoids two threads executing a block at the same time (mutual exclusion).
// join() → makes one thread wait for another to finish (coordination).
// Object level locking (Synchronized block)         
class First{
    public void display(String name){
        System.out.print("[");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception "+e);}
        System.out.print(name);
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception "+e);}
        System.out.println("]");
    }
}
class Second extends Thread{
    First obj;
    String name;
    Second(First obj , String name){
        this.obj = obj;
        this.name = name;
        start();
    }
    @Override 
    public void run(){
        synchronized(obj){
            obj.display(name);
        }
    }
}
class Demo13{
    public static void main(String args[]){
        First fobj = new First();
        Second obj1 = new Second(fobj,"Anmol");
        Second obj2 = new Second(fobj,"Udit");
        Second obj3 = new Second(fobj,"Vaibhav");
    }
}