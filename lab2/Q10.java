// Find the no. of occurrence of each element in a user entered list of nos.
// Input:   Enter list of numbers  e.g.( 15 25 15 11 25 32 15 32)  
// Output:  Occurrence of 15=3
//    Occurrence of 25=2
//    Occurrence of 11=1
//     Occurrence of 32=2

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[i] = 1;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (count[i] == 0) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count[i]++;
                    count[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count[i] != 0) {
                System.out.println("Occurrence of " + arr[i] + "=" + count[i]);
            }
        }
    }
}
