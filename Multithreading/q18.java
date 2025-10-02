// Example showing Deadlock

class Paper {}
class Pen {}

class Demo18 {
    public static void main(String args[]) {
        Paper pr = new Paper();
        Pen pn = new Pen();

        // Thread 1 locks Pen first, then tries to lock Paper
        new Thread() {
            @Override
            public void run() {
                synchronized (pn) {
                    System.out.println("Thread 1: locked Pen, needs Paper...");

                    try {
                        Thread.sleep(1000); // give chance to other thread
                    } catch (InterruptedException e) {
                        System.out.println("Exception : " + e);
                    }

                    synchronized (pr) {
                        System.out.println("Thread 1: locked Paper too");
                    }
                }
            }
        }.start();

        // Thread 2 locks Paper first, then tries to lock Pen
        new Thread() {
            @Override
            public void run() {
                synchronized (pr) {
                    System.out.println("Thread 2: locked Paper, needs Pen...");

                    try {
                        Thread.sleep(1000); // give chance to Thread 1
                    } catch (InterruptedException e) {
                        System.out.println("Exception : " + e);
                    }

                    synchronized (pn) {
                        System.out.println("Thread 2: locked Pen too");
                    }
                }
            }
        }.start();
    }
}
