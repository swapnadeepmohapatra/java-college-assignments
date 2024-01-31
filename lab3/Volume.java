import java.util.Scanner;

public class Volume {
    int length;
    int width;
    int height;

    Volume(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter height:");
        int h = sc.nextInt();
        System.out.println("Enter width:");
        int w = sc.nextInt();
        Volume v = new Volume(l, w, h);
        System.out.println("The volume is " + v.volume());
        sc.close();
    }
}