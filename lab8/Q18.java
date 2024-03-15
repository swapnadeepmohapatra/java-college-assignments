// Write code for display even number in and odd number separately from an an array using Thread.

public class Q18 {
    static class EvenOdd extends Thread {
        int[] arr;
        boolean isEven;

        EvenOdd(int[] arr, boolean isEven) {
            this.arr = arr;
            this.isEven = isEven;
        }

        public void run() {
            if (isEven) {
                System.out.print("Even numbers: ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.print("Odd numbers: ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Thread t1 = new EvenOdd(arr, true);
        Thread t2 = new EvenOdd(arr, false);

        t1.start();
        t2.start();
    }
}
