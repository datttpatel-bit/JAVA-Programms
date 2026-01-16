// pr 7.4

//Write a Java program to display all running threads.

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class main61 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        t1.start();
        t2.start();

        ThreadGroup group = Thread.currentThread().getThreadGroup();
        int count = group.activeCount();

        Thread[] threads = new Thread[count];
        group.enumerate(threads);

        System.out.println("\n--- Running Threads ---");
        for (Thread t : threads) {
            System.out.println("Thread Name: " + t.getName());
        }
    }
}