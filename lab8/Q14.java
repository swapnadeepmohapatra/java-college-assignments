//Write a code to get the state of a given thread in Java.

public class Q14 {
    static class Multi extends Thread {
        String msg;

        Multi(String msg) {
            this.msg = msg;
        }

        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Multi("Good Morning");
        Thread t2 = new Multi("Welcome");

        System.out.println("t1 status: " + t1.getState());
        System.out.println("t2 status: " + t2.getState());

        t1.start();

        System.out.println("t1 status: " + t1.getState());
        System.out.println("t2 status: " + t2.getState());

        t2.start();

        System.out.println("t1 status: " + t1.getState());
        System.out.println("t2 status: " + t2.getState());
    }
}
