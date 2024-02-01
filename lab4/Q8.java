// Write a program in
// Java to create a class MyVolume with required data members and find the
// volume of cube, cuboid and sphere using constructor overloading.

class MyVolume {
    double vol;

    MyVolume(int side) {
        vol = side * side * side;
    }

    MyVolume(int length, int breadth, int height) {
        vol = length * breadth * height;
    }

    MyVolume(double radius) {
        vol = 3.14 * radius * radius;
    }

    double volume() {
        return vol;
    }
}

class Q8 {
    public static void main(String args[]) {
        MyVolume cube = new MyVolume(10);
        System.out.println("Volume of cube with side 10 is " + cube.volume());

        MyVolume cuboid = new MyVolume(10, 12, 15);
        System.out.println("Volume of cuboid with length 10, breadth 12 and height 15 is " + cuboid.volume());

        MyVolume sphere = new MyVolume(2.5);
        System.out.println("Volume of sphere with radius 2.5 is " + sphere.volume());
    }
}
