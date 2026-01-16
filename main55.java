// pr6.3
// Write a program to catch multiple exceptions such as 
// ArrayIndexOutOfBounds Exception, NumberFormatException, 
// NullPointerException and also use finally block. 
public class main55 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println("Accessing 5th element: " + arr[4]);  
            String str = "abc";  
            int num = Integer.parseInt(str);  
            String name = null;
            System.out.println("Length of name: " + name.length());  

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert string to number.");
        } 
        catch (NullPointerException e) {
            System.out.println("Error: Null value found.");
        } 
        finally {
            System.out.println("This is the finally block. It always runs.");
        }
        System.out.println("Program continues...");
    }
}