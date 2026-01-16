//pr1.7
// Write a Java program to calculate: 
// 1. Area of a Triangle = (1/2) × base × height 
// 2. Perimeter of a Rectangle = 2 × (length + breadth)

import java.util.Scanner;

public class main5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        double base = sc.nextDouble();
        System.out.println("Enter height : ");
        double height = sc.nextDouble();
        double areaofTriangle = (0.5) * base * height;
        System.out.println("Area of triangle is : " + areaofTriangle);

        System.out.println("Enter length : ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth : ");
        double breadth = sc.nextDouble();
        double perimeterofArectangle = 2 * (length + breadth);
        System.out.println("Perimeter of a Rectangle : " + perimeterofArectangle);
    }
}