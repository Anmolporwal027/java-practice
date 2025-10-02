// example showing the concept of MultiThreading 
/*
    🔹 What is a Daemon Thread?
    A Daemon thread is a background service thread.
    Its job is to support other non-daemon (user) threads.
    Example: Garbage Collector (GC) in JVM is a daemon thread.
*/
class Demo10 extends Thread{
    public void run(){
        //System.out.println("Thread Name : "+Thread.currentThread().getName()+" isAlive : "+Thread.currentThread().isDaemon());
        if(Thread.currentThread().isDaemon())
            System.out.println("Thread Name : "+Thread.currentThread().getName()+" Daemon Thread");
        else
            System.out.println("Thread Name : "+Thread.currentThread().getName()+" Not a daemon thread");    
    }
    public static void main(String args[]){
        Demo10 obj1 = new Demo10();
        Demo10 obj2 = new Demo10();
        Demo10 obj3 = new Demo10();        
        
        obj3.setDaemon(true);
        obj1.setDaemon(true);
        
        obj1.start();
        obj2.start();
        obj3.start();
    }
}