/*
When one thread calls join() on another thread, it means:
👉 "Wait here until that other thread finishes completely."

So:

If t1.join() is called inside the main thread → main will pause until t1 finishes.

After that, the main thread continues execution.
*/
class Demo7 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread Name : "+Thread.currentThread().getName()+" ------> "+(i+1));
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
    public static void main(String args[]){
        Demo7 obj1 = new Demo7();
        Demo7 obj2 = new Demo7();
        obj1.start();
        try{
            obj1.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception "+e);
        }
        obj2.start();
    }
}