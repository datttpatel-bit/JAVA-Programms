// pr 8.3

// Write a Java Program to  read the data from the file using FileInputStream. 

import java.io.FileInputStream;
import java.io.IOException;

public class main64 {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            FileInputStream fis = new FileInputStream("c.txt");
            int ch;

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}