// pr2.14
//  Write a Java program to declare three variables a = 5, b = 2.5, c = 4.0, and 
// display the result of: 
// System.out.println(a + b * c); 
// System.out.println(++a * b - c); 
// System.out.println(a / b + c); 

public class main23 {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;
        double c = 4.0;

        System.out.println(a + b * c); // 5 + 2.5 * 4.0 = 5 + 10.0 = 15.0
        System.out.println(++a * b - c); // ++a = 6 → 6 * 2.5 = 15.0 → 15.0 - 4.0 = 11.0
        System.out.println(a / b + c); // a is now 6 → 6 / 2.5 = 2.4 → 2.4 + 4.0 = 6.4
    }
}