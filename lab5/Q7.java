// Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and
// Cone from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume (
// ). Override these two methods in each of the derived classes to calculate the volume
// and whole surface area of each type of three-dimensional objects. The dimensions of
// the objects are to be taken from the users and passed through the respective
// constructors of each derived class. Write a main method to test these classes.

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0;
    }

    public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    private double length, breadth, height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double volume() {
        return length * breadth * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    public double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        System.out.println("Box volume: " + box.volume());
        System.out.println("Box whole surface area: " + box.wholeSurfaceArea());

        Cube cube = new Cube(10);
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube whole surface area: " + cube.wholeSurfaceArea());

        Cylinder cylinder = new Cylinder(10, 20);
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder whole surface area: " + cylinder.wholeSurfaceArea());

        Cone cone = new Cone(10, 20);
        System.out.println("Cone volume: " + cone.volume());
        System.out.println("Cone whole surface area: " + cone.wholeSurfaceArea());
    }
}
