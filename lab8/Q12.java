// Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

public class Q12 {
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

        t1.start();
        t2.start();
    }
}
