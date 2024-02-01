class Point {
    int _x;
    int _y;
    int _z;

    Point() {

    }

    Point(int x, int y, int z) {
        _x = x;
        _y = y;
        _z = z;
    }

    Point(Point p) {
        _x = p._x;
        _y = p._y;
        _z = p._z;
    }

    // Distance from origin 0,0,0
    float find_distance() {
        float distance = (float) Math.sqrt((_x * _x) + (_y * _y) + (_z * _z));

        return distance;
    }

    float find_distance(int x2, int y2, int z2) {
        float distance = (float) Math.sqrt((x2 - _x) * (x2 - _x) + (y2 - _y) * (y2 - _y) + (z2 - _z) * (z2 - _z));

        return distance;
    }

    float find_distance(Point p) {
        float distance = (float) Math
                .sqrt((p._x - _x) * (p._x - _x) + (p._y - _y) * (p._y - _y) + (p._z - _z) * (p._z - _z));

        return distance;
    }

    boolean is_equal(Point p) {
        return _x == p._x && _y == p._y && _z == p._z;
    }

    void Show() {
        System.out.println("Point: " + _x + ", " + _y + ", " + _z);
    }
}

class Q12 {
    public static void main(String args[]) {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(p1);
        Point p3 = new Point(4, 5, 6);

        System.out.println("Distance from origin: " + p1.find_distance());
        System.out.println("Distance from origin: " + p2.find_distance());
        System.out.println("Distance from origin: " + p3.find_distance());

        System.out.println("Distance from point: " + p1.find_distance(1, 2, 3));
        System.out.println("Distance from point: " + p2.find_distance(1, 2, 3));
        System.out.println("Distance from point: " + p3.find_distance(1, 2, 3));

        System.out.println("Distance from point: " + p1.find_distance(p1));
        System.out.println("Distance from point: " + p2.find_distance(p1));
        System.out.println("Distance from point: " + p3.find_distance(p1));

        System.out.println("Distance from point: " + p1.find_distance(p2));
        System.out.println("Distance from point: " + p2.find_distance(p2));
        System.out.println("Distance from point: " + p3.find_distance(p2));

        System.out.println("Distance from point: " + p1.find_distance(p3));
        System.out.println("Distance from point: " + p2.find_distance(p3));
        System.out.println("Distance from point: " + p3.find_distance(p3));

        System.out.println("Is p1 equal to p2? " + p1.is_equal(p2));
        System.out.println("Is p1 equal to p3? " + p1.is_equal(p3));
        System.out.println("Is p2 equal to p3? " + p2.is_equal(p3));
    }
}
