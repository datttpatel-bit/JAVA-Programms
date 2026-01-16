//pr5.6
// Write a Java program to using function overloading method to read set
// of integers and floating point numbers separately and to store it in the
// corresponding arrays. Again read a number from the keyboard and
// check whether the number ‘d’ is present in the arrays. If it is so, print
// out how many times the number ‘d’ is repeated in the array.

import java.util.*;
class NumberCheck {
    void find(int arr[], int d) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                count++;
            }
        }
        if (count > 0)
            System.out.println(d + " is present " + count + " times in integer array.");
        else
            System.out.println(d + " is not present in integer array.");
    }
    void find(float arr[], float d) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                count++;
            }
        }
        if (count > 0)
            System.out.println(d + " is present " + count + " times in float array.");
        else
            System.out.println(d + " is not present in float array.");
    }
}
public class main46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberCheck n = new NumberCheck();

        System.out.print("Enter size of integer array: ");
        int n1 = sc.nextInt();
        int intArr[] = new int[n1];
        System.out.println("Enter " + n1 + " integers:");
        for (int i = 0; i < n1; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.print("Enter size of float array: ");
        int n2 = sc.nextInt();
        float floatArr[] = new float[n2];
        System.out.println("Enter " + n2 + " floats:");
        for (int i = 0; i < n2; i++) {
            floatArr[i] = sc.nextFloat();
        }
        System.out.print("Enter an integer to search: ");
        int intSearch = sc.nextInt();
        n.find(intArr, intSearch);
        System.out.print("Enter a float to search: ");
        float floatSearch = sc.nextFloat();
        n.find(floatArr, floatSearch);
        sc.close();
    }
}