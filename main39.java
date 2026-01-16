//pr4.6
// Write a Java program using method overloading to find maximum of two 
// integers, three integers, and two double values.

import java.util.*;

class max {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }
}

public class main39 {
    public static void main(String[] args) {
        
        max m1 = new max();

        System.out.println("Max of 10 and 20 (int): " + m1.max(10, 20));
        System.out.println("Max of 5, 15 and 10 (int): " + m1.max(5, 15, 10));
        System.out.println("Max of 12.5 and 9.8 (double): " + m1.max(12.5, 9.8));
    }
}