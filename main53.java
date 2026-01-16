// pr6.1
// Write a program to catch the ArithmeticException such as division by zero.

import java.util.*;
public class main53 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}