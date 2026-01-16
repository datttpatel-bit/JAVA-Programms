//pr5.7
// Create a Java class named Box that calculates the volume of a box. The
// class should have instance variables named length, width, and height,
// which are initialized with values obtained from user input. Implement a
// method within the class named calculateVolume() that computes and
// returns the volume of the box.

import java.util.*;

class Box {
    double length, width, height; 

    double calculateVolume(double length, double width, double height) {
        return length * width * height; 
    }
}

public class main47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = b.calculateVolume(length,width,height);
        System.out.println("Volume of Box = " + volume);

    }
}