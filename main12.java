//pr2.4
// Write a Java program to check whether a given number is even or odd using a 
// command line argument. 

public class main12 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }
}