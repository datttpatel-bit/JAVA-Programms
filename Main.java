// Print the sum of first N natural numbers.

// import java.util.*;

// public class Main {
//     public static void main(String args[]) {
//         System.out.print("Enter the number you want to sum : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println("Sum is : " + sum);
//     }
// }

import java.util.Scanner;

public class Main {

    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}