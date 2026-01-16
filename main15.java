//pr2.7
// Write a Java program to generate and print n terms of the Harmonic series. 
// Harmonic series: 1 + 1/2 + 1/3 + 1/4 + ...
public class main15 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;

        System.out.print("Harmonic Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
    }
}