//pr1.9
// Write a Java program that accepts your name and age as command-line arguments 
// and prints: 
// Hello, [Name]! You are [Age] years old.

import java.util.*;

public class main7 {
    public static void main(String[] args) {

        String name = args[0];
        String age = args[1];

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}