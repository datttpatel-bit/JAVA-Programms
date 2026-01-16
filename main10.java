//pr2.2
// Write a Java program to take two floating-point numbers from the command 
// line and print their sum, difference, product, quotient, and modulus. 

public class main10 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);

        System.out.println("Sum is : " + (n1 + n2));
        System.out.println("Difference is : " + (n1 - n2));
        System.out.println("Product is : " + (n1 * n2));
        System.out.println("Quotient, is : " + (n1 / n2));
        System.out.println("Modulo is : " + (n1 % n2));
    }
}