//pr5.2
//  Create a Class named Equation having following methods which finds
// roots quadratic equation: a) Get_info() :- to set instance variable values.
// b) Real():- to evaluate real roots values c) Equal_values():- to evaluate
// equal values. d) Imaginary():- to calculate imaginary root i.e not
// possible roots. Create an another class Quadratic residing main()
// methods which contains finds Delta values and according to result call
// the appropriate method in Equation Class.

import java.util.*;

class Equation {
    double a, b, c;

    void Get_info(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    void Real() {
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("Roots are real and distinct:");
        System.out.println("Root1 = " + r1 + ", Root2 = " + r2);
    }

    void Equal_values() {
        double r = -b / (2 * a);
        System.out.println("Roots are real and equal:");
        System.out.println("Root1 = Root2 = " + r);
    }

    void Imaginary() {
        double realPart = -b / (2 * a);
        double imagPart = Math.sqrt(b * b - 4 * a * c) / (2 * a);
        System.out.println("Roots are imaginary:");
        System.out.println("Root1 = " + realPart + " + " + imagPart + "i");
        System.out.println("Root2 = " + realPart + " - " + imagPart + "i");
    }
}

public class main42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values of a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Equation eq = new Equation();
        eq.Get_info(a, b, c);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            eq.Real();
        } else if (delta == 0) {
            eq.Equal_values();
        } else {
            eq.Imaginary();
        }
    }
}