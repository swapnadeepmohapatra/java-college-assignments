// Write a code to  get the reference to the current thread in Java?

public class Q15 {
    static class Multi extends Thread {
        String msg;

        Multi(String msg) {
            this.msg = msg;
        }

        public void run() {
            try {
                Thread.sleep(200);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Multi("Good Morning");
        Thread t2 = new Multi("Welcome");

        System.out.println("Current Thread: " + Thread.currentThread().getName());

        t1.start();

        System.out.println("Current Thread: " + Thread.currentThread().getName());

        t2.start();

        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}
