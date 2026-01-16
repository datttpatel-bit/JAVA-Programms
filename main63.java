// pr 8.2

//Write a Java Program  to reverse the elements of an array read from the 
//file and store it in another file. Use FileInputStream and 
//FileOutputStream. 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main63 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            FileInputStream fis = new FileInputStream(inputFile);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();

            String content = new String(data);
            String[] numbers = content.split(" ");

            for (int i = 0; i < numbers.length / 2; i++) {
                String temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp;
            }

            FileOutputStream fos = new FileOutputStream(outputFile);
            for (String num : numbers) {
                fos.write((num + " ").getBytes());
            }
            fos.close();

            System.out.println("Reversed array written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}