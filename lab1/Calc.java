import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int sum = a + b;
        int dif = a - b;
        int pro = a * b;
        int div = a / b;
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + dif);
        System.out.println("Product is " + pro);
        System.out.println("Division is " + div);
    }
}