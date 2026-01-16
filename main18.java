//pr2.10
// Write a Java program to show widening and narrowing typecasting between 
// int, float, and double.

// Explanation:
// Widening (Implicit Casting): Lower → higher data type (e.g., int → float → double)
// Narrowing (Explicit Casting): Higher → lower data type (e.g., double → float → int)

public class main18 {
    public static void main(String[] args) {
        int intVal = 42;

        float floatVal = intVal;         
        double doubleVal = floatVal; 

        System.out.println("Widening Typecasting:");
        System.out.println("int to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);

        double d = 123.456;
        float f = (float) d;            
        int i = (int) f;      

        System.out.println("Narrowing Typecasting:");
        System.out.println("double to float: " + f);
        System.out.println("float to int: " + i);
    }
}