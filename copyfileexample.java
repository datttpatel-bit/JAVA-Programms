// Pract8.4  Write a Java Program to read the data from the file and copy it on another file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfileexample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("source.txt");
            FileOutputStream fout = new FileOutputStream("destination.txt");
            int data;
            while ((data = fin.read()) != -1) {
                fout.write(data);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully!");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}