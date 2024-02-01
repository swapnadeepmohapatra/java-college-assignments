import java.util.Scanner;

class Number {
    boolean is_Even(int n) {
        return n % 2 == 0;
    }

    boolean is_Prime(int n) {
        boolean flag = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    int fin_Factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return fin_Factorial(n - 1);
    }
}

class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The number is " + (n.is_Even(num) ? "even" : "odd"));
        System.out.println("The number is " + (n.is_Prime(num) ? "prime" : "not prime"));
        System.out.println("The factorial of the number is " + n.fin_Factorial(num));

        sc.close();
    }
}
