import java.util.Scanner;

public class Coprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        if (checkCoPrime(a, b)) {
            System.out.println("Numbers are Co-Prime");
        } else {
            System.out.println("Numbers are not Co-Prime");
        }

        sc.close();
    }

    public static Boolean checkCoPrime(int a, int b) {
        Boolean flag = true;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}