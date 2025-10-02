class Demo8 extends Thread{
    public void run(){
        System.out.println("Thread : "+Thread.currentThread()+"\tThread Name : "+Thread.currentThread().getName()+"\tPriority : "+Thread.currentThread().getPriority());
    }

    public static void main(String args[]){
        Demo8 obj1 = new Demo8();
        Demo8 obj2 = new Demo8();
        Demo8 obj3 = new Demo8();

        obj1.setName("Anmol");
        obj2.setName("Udit");
        obj3.setName("Raj");

        // obj1.setPriority(1);
        // obj2.setPriority(2);
        // obj3.setPriority(3);

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj3.setPriority(Thread.NORM_PRIORITY);

        obj1.start();
        obj2.start();
        obj3.start();
    }
}