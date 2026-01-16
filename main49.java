// pr 5.8 change
// Write a program to create interface shape containing area() method. 
// Now create Rectangle, Triangle, Sphere class that implements shape 
// interface and override area() to calculate area of rectangle ,triangle and 
// sphere. 

// same as old 5.5 but in this code user interface.
import java.util.*;

interface Shape {
    void area();   
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double a = length * width;
        System.out.println("Rectangle Area = " + a);
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        double a = 0.5 * base * height;
        System.out.println("Triangle Area = " + a);
    }
}

class Sphere implements Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public void area() {
        double a = 4 * 3.14 * radius * radius;
        System.out.println("Sphere Area = " + a);
    }
}

public class main49 {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(8, 6);
        Shape s = new Sphere(7);

        r.area();
        t.area();
        s.area();
    }
}