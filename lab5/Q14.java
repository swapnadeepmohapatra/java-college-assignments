// Combine Question number 10 and 11 and have all the three classes together. Now
// describe the working of all classes.

class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    public void showNum() {
        System.out.println("Number: " + number);
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
    }
}

class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    public void showNum() {
        System.out.println("Number: " + number);
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Q14 {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(10);
        hexNum.showNum();

        OctNum octNum = new OctNum(10);
        octNum.showNum();
    }
}
