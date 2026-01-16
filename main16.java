//pr2.8
// Write a Java program to print all factors of a given number using a command 
// line argument. 
public class main16 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        System.out.print("Factors of " + num + " are:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}