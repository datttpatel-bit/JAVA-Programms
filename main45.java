//pr5.5
// Write a program to find area of different shapes using function
// overloading like as rectangle, triangle, sphere passing different
// arguments to overloaded method Area().
import java.util.*;
class Shape {
    
    double Area(double length, double breadth) {
        return length * breadth;
    }

    double Area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    double Area(double radius) {
        return 4 * 3.14 * radius * radius;
    }
}

public class main45 {
    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("Area of Rectangle = " + s.Area(10, 5));

        System.out.println("Area of Triangle = " + s.Area(10, 6, true));

        System.out.println("Area of Sphere = " + s.Area(7));
    }
}