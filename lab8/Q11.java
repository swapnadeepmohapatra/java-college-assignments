// Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

public class Q11 {
    static class Multi extends Thread {
        String msg;

        Multi(String msg) {
            this.msg = msg;
        }

        public void run() {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Multi("Good Morning");
        Thread t2 = new Multi("Welcome");

        t1.start();
        t2.start();
    }
}