//pr4.5
// Create a class Shape with overloaded methods calculateArea() to find area of
// circle, square, and rectangle using different arguments.

import java.util.*;

class Shape {
    public double calculateArea(double radius) {   
        return 3.14 * radius * radius;
    }

    public double calculateArea(int side) {       
        return side * side;
    }

    public double calculateArea(double length, double breadth) {   
        return length * breadth;
    }
}

public class main38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter Side: ");
        int side = sc.nextInt();
        
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();
        
        Shape s1 = new Shape();  
        
        System.out.println("Area of Circle is: " + s1.calculateArea(radius));
        System.out.println("Area of Square is: " + s1.calculateArea(side));
        System.out.println("Area of Rectangle is: " + s1.calculateArea(length, breadth)); 
    }
}