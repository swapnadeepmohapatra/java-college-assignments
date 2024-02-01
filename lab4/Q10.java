import java.util.Scanner;

class Traingle {
    int a;
    int b;
    int c;

    void set_Dim(int s1, int s2, int s3) {
        a = s1;
        b = s2;
        c = s3;
    }

    boolean is_Traingle() {
        boolean flag = true;

        if (a + b <= c || a + c <= b || b + c <= a) {
            flag = false;
        }

        return flag;
    }

    float find_area() {
        if (is_Traingle()) {
            return (float) Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / 4;
        } else {
            System.out.println("Area of a shape which is not a trianglee cannnot be found out.");
            return -1;
        }
    }

    float find_perimeter() {
        if (is_Traingle()) {
            return (float) a + b + c;
        } else {
            System.out.println("Perimeter of a shape which is not a trianglee cannnot be found out.");
            return -1;
        }
    }

    void show() {
        System.out.println("The traingle is of sides: " + a + ", " + b + ", " + c);
        System.out.println("Area of the traingle is " + find_area());
        System.out.println("Perimeter of the traingle is " + find_perimeter());
    }
}

class Q10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Traingle t = new Traingle();

        System.out.println("Enter the sides of the traingle: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        t.set_Dim(s1, s2, s3);
        t.show();

        sc.close();
    }
}
