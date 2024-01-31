import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        if (a == reverseNumber(a)) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }

    public static int reverseNumber(int n) {
        int newNo = 0;
        while (n > 0) {
            newNo = (newNo * 10) + (n % 10);
            n = n / 10;
        }
        return newNo;
    }
}