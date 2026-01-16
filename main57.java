// pr 6.5
// Write a program that shows the use of throws keyword. 

import java.io.*; 
public class main57 {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("myfile.txt");
        System.out.println("File opened successfully.");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } 
        catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}