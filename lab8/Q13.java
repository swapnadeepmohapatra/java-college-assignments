// Demonstrate gerPriority() and setPriority() methods in Java threads.

public class Q13 {
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

        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println("t1 priority: " + t1.getPriority());
        System.out.println("t2 priority: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
