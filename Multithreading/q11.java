/*
    Runnable has only one method:
        public void run();
    
    This line does 3 things:
    new Demo11() → creates a Runnable object.
    new Thread(Runnable) → creates a Thread object and links it with your runnable task.
    .start() → starts a new thread which will internally call the run() method of your Demo11.
*/
class Demo11 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread : " + Thread.currentThread()+"Thread Name : " + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
    //    Demo11 obj = new Demo11(); //creates a Runnable object. or creates a work or task
    //    Thread th = new Thread(obj); // passing it to thread
    //    th.start(); //then thread will execute it 

    //    Thread th = new Thread(new Demo11());
    //    th.start();

    new Thread(new Demo11()).start();
    }
}
