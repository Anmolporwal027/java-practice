/*
   All The types from which we can create and run thread
*/
class Demo12{
    public static void main(String args[]) {

    //    Runnable r = new Runnable(){
    //       @Override
    //       public void run(){
    //         System.out.println("Thread : "+Thread.currentThread()+"\t Thread Name : "+Thread.currentThread().getName());
    //       }
    //    };
    //     Thread th = new Thread(r);
    //     th.start();

    // Thread th = new Thread(new Runnable(){
    //     @Override
    //     public void run(){
    //         System.out.println("Thread : "+Thread.currentThread()+"\t Thread Name : "+Thread.currentThread().getName());
    //     }
    // });
    // th.start();

    // new Thread(new Runnable(){
    //     @Override
    //     public void run(){
    //         System.out.println("Thread : "+Thread.currentThread()+"\t Thread Name : "+Thread.currentThread().getName());
    //     }
    // }).start();
    
    
    // Thread th = new Thread(){
    //     public void run(){
    //         System.out.println("Thread : "+Thread.currentThread()+"\t Thread Name : "+Thread.currentThread().getName());
    //     }
    // };
    // th.start();

    // new Thread(){
    //     public void run(){
    //         System.out.println("Thread : "+Thread.currentThread()+"\t Thread Name : "+Thread.currentThread().getName());
    //     }
    // }.start();

    // Runnable obj = ()->{System.out.println("Run methoddd");};
    // Thread th = new Thread(obj);
    // th.start();

    // Thread th = new Thread(()->{System.out.println("RUN Method ");});
    // th.start();

    new Thread(()->System.out.println("run method executes")).start();
    
    }
}
