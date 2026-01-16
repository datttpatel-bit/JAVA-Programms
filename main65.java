// pr 8.4

// Write a Java Program to read the data from the file and copy it on another file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main65 {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            int ch;

            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}