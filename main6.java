//pr1.8
// Write a Java program to convert temperature from Celsius to Fahrenheit. 
// Formula: F = (C × 1.8) + 32 

import java.util.Scanner;

public class main6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius : ");
        double C = sc.nextDouble();

        double Fahrenheit = (C * 1.8) + 32;
        System.out.println("Celsius to Fahrenheit is : " + Fahrenheit);
    }
}