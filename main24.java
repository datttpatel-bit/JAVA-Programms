//pr3.1
// Write a Java program to accept n numbers from the user, store them in an array, and 
// find the sum and average of the elements. 

import java.util.*;

public class main24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i]; 
        }
        double avg = (double) sum / n;
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + avg);
    }
}