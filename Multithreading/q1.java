// Thread methods
class Q1{
    public static void main(String args[]){
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().getId());
    }
}