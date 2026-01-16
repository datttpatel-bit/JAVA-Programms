// pr 8.1

//Write a Java Program  to reverse a string without using any string inbuilt method. 

import java.util.Scanner;

public class main62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed string: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}