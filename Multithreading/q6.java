/*
🔹 How can Thread-1 run "again" before Thread-0 wakes up?

Think of it like this:

At t = 0 sec:

Thread-0 runs → prints 1 → goes to sleep for 1 sec.

Scheduler switches to Thread-1.

Thread-1 runs → prints 1 → goes to sleep for 1 sec.

👉 Now both threads are sleeping until t = 1 sec.

At t = 1 sec:

Both Thread-0 and Thread-1 become ready (they wake up almost together).

But only one can run first → scheduler decides randomly.

Suppose CPU picks Thread-1 first → it prints 2 and sleeps again.

Then CPU gives time to Thread-0 → it prints 2 and sleeps again.

👉 That’s why sometimes you see order like 0 1 1 0.
*/
class Demo6 extends Thread{
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
        Demo6 obj1 = new Demo6();
        Demo6 obj2 = new Demo6();
        obj1.start();
        obj2.start();
    }
}