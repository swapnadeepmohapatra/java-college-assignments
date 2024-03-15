// Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.

public class Q17 {
    static class Producer extends Thread {
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producing...");
            synchronized (this) {
                notify();
            }
        }
    }

    static class Consumer extends Thread {
        Producer producer;

        Consumer(Producer producer) {
            this.producer = producer;
        }

        public void run() {
            synchronized (producer) {
                try {
                    System.out.println("Waiting for producer to produce...");
                    producer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consuming...");
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);

        consumer.start();
        producer.start();
    }
}
