// Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.
// Input:   Enter 3X3 matrix  
//          e.g.     6 7 3
//                     8 9 2
//                 1 2 9
//               Output: Left=24
//             Right=13

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < r; i++) {
            left += arr[i][i];
            right += arr[i][r - i - 1];
        }

        System.out.println("Left=" + left);
        System.out.println("Right=" + right);
    }
}
