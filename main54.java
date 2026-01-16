// pr 6.2
// Write a program to apply the nested try blocks and multiple catch blocks. 

public class main54 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[1]);

            try {
                int result = 10 / 0; 
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Outer catch: Some other exception occurred.");
        }
        System.out.println("Program continues...");
    }
}