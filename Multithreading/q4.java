// example showing the concept of MultiThreading 
/*
Example timeline in your code:

obj1.start(); → A new thread for obj1 is created and starts running run().

Thread.sleep(1000); → The main thread pauses for 1 sec, but obj1 keeps running during this time.

After 1 sec, obj2.start(); → Now second thread starts.

Again main sleeps for 1 sec, but obj2 continues running.

Then obj3.start(); is called, same process.

🔹 Important conclusion:

👉 sleep() does not stop all threads.
👉 It only pauses the thread that calls it. In your case, that’s the main thread.
*/
class Demo4 extends Thread{
    public void run(){
        System.out.println("Thread : "+Thread.currentThread()+"\n Thread Name : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();
        Demo4 obj3 = new Demo4();

        obj1.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }

        obj2.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }

        obj3.start();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
    }
}