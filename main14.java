//pr2.6
// Write a Java program to check if the given number is a perfect number or not. 
// (A number is perfect if sum of its divisors excluding itself is equal to the number.) 
// Example: 28 → 1+2+4+7+14 = 28
public class main14 {
    public static void main(String args[]) {

        int num = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Number is Perfect.");
        } else {
            System.out.println("Number is Not Perfect.");
        }
    }
}