//pr3.7
// Write a Java program using the StringBuilder class to demonstrate: append(), 
// insert(), deleteCharAt(), replace(), reverse(). 

public class main30 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        sb.replace(5, 9, "C++");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}