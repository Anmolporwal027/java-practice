// synchronized → avoids two threads executing a block at the same time (mutual exclusion).
// join() → makes one thread wait for another to finish (coordination).
// static synchronization 

class First{
    synchronized static void show(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }

    synchronized public static void display(String name){
        System.out.print("[");
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception "+e);}
        System.out.print(name);
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception "+e);}
        System.out.println("]");
    }
}

class Second extends Thread{
    String name;
    Second(String name){
        this.name = name;
        start();
    }

    @Override 
    public void run(){
        First.show();
        First.display(name);
    }
}

class Demo15{
    public static void main(String args[]){
        Second obj1 = new Second("Anmol");
        Second obj2 = new Second("Udit");
        Second obj3 = new Second("Vaibhav");
    }
}