// Pract 8.3 Write a Java Program to read the data from the file using FileInputStream.

import java.io.FileInputStream;
import java.io.IOException;

public class readfileexample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("example.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}