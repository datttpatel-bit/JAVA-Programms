//pr1.6
// Write a Java program that prints your favorite quote inside a decorative box 
// made with # symbols. 
// Example: 
// ######################### 
// #  "Keep Learning Java" # 
// #########################

import java.util.Scanner;
public class main4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a quote : ");
        String quote = sc.nextLine();

        int boxWidth = quote.length() + 4; // 2 spaces and 2 # symbols

        for (int i = 0; i < boxWidth; i++) {
            System.out.print("#");
        }
        System.out.println();

        System.out.println("# " + quote + " #");

        for (int i = 0; i < boxWidth; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}