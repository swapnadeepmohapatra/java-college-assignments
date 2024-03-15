// Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.

public class Q16 {
    static int counter = 0;

    static class Multi extends Thread {
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
            System.out.println("Counter: " + counter);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Multi();
        Thread t2 = new Multi();

        t1.start();
        t2.start();
    }
}
