//pr3.2
// Write a Java program to create two 2D arrays and find their transpose. 

import java.util.*;

public class main25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols of Array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int mat[][] = new int[rows][cols];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int trans[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}