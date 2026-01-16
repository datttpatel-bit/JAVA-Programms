//pr3.8
// Write a Java program to split a sentence into words, store them in an array, and 
// display the words in reverse order. 

import java.util.*;

public class main31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words in reverse order:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}