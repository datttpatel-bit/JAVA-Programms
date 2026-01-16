//pr3.3
// Write a Java program to find the second largest element in an array. 

// import java.util.*;
// public class main26 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             } else if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }
//         if (secondLargest == Integer.MIN_VALUE) {
//             System.out.println("There is no second largest element.");
//         } else {
//             System.out.println("Second largest element is: " + secondLargest);
//         }
//     }
// }

import java.util.*;
import java.util.Scanner;

public class main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Largest : " + arr[n - 2]);
    }
}