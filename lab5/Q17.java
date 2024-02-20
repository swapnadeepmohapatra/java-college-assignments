// Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
// Input: Enter  dimensions
// Output:  Display the cost of plastic

class Sheet {
    int length;
    int breadth;

    public Sheet(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayCost() {
        System.out.println("Cost of sheet: " + length * breadth * 40);
    }
}

class Box extends Sheet {
    int height;

    public Box(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public void displayCost() {
        System.out.println("Cost of box: " + length * breadth * height * 60);
    }
}

public class Q17 {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        box.displayCost();

        Sheet sheet = new Sheet(10, 20);
        sheet.displayCost();
    }
}
