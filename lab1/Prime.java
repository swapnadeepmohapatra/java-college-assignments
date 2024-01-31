import java.util.Scanner;

public class Prime {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        if (checkPrime(a)){
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }

    public static Boolean checkPrime(int n){
        Boolean flag = true;
        for (int i = 2; i < n; i++){
            if(n%i == 0){
                flag = false;
            }
        }
        return flag;
    }
}