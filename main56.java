// pr6.4
// Write a program to throw your own exception by extending the Exception 
// class.

class MyException extends Exception {
    public MyException(String message) {
        super(message);  
    }
}

public class main56 {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new MyException("Age must be 18 or above!");
            }
            System.out.println("You are allowed.");

        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}