//pr2.11
//  Write a Java program to print all prime numbers between 1 and n using:  

//(a) for loop 
import java.util.Scanner;
public class main20 {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");        
        num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num+" is Prime.");
        } else {
            System.out.println(num+" is not Prime.");
        }
    }
}

//(b) while loop 
// import java.util.Scanner;
// public class main20 {
//     public static void main(String args[]) {
//         int num;
//         System.out.println("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         num = sc.nextInt();

//         boolean isPrime = true;
//         int i = 2;
//         while (i < num) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//             i++;
//         }
//         if (isPrime) {
//             System.out.println(num + " is Prime.");
//         } else {
//             System.out.println(num + " is not Prime.");
//         }
//     }
// }

//(c) do-while loop 
// import java.util.Scanner;

// public class main20 {
//     public static void main(String args[]) {
//         int num;
//         System.out.println("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         num = sc.nextInt();

//         boolean isPrime = true;
//         int i = 2;
//         do {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//             i++;
//         } while (i < num);
//         if (isPrime) {
//             System.out.println(num + " is Prime.");
//         } else {
//             System.out.println(num + " is not Prime.");
//         }
//     }
// }