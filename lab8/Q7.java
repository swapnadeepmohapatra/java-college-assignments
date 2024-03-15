// How to convert an array to string in Java?

public class Q7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        System.out.println("Array to string: " + str);
    }
}