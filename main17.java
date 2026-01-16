//pr2.9
// Write a Java program to find the maximum and minimum of four numbers 
// using nested if-else. 
public class main17 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);

        int max = num1;
        int min = num1;

        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;
        if (num4 > max)
            max = num4;

        if (num2 < min)
            min = num2;
        if (num3 < min)
            min = num3;
        if (num4 < min)
            min = num4;

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}