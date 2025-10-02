/*
isAlive() returns:

true → if that thread is still running.
false → if the thread has already finished.

Since your threads only print once and finish instantly, by the time the main thread checks (after 1 second), all threads are already finished.
*/
class Demo9 extends Thread{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo9 obj1 = new Demo9();
        Demo9 obj2 = new Demo9();
        Demo9 obj3 = new Demo9();

        obj1.start();
        obj2.start();
        obj3.start();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Exception "+e);
        }
        System.out.println("Thread-0 : "+obj1.isAlive());
        System.out.println("Thread-1 : "+obj2.isAlive());
        System.out.println("Thread-2 : "+obj3.isAlive());

    }
}