// OOP pr1.2
// import java.util.*;
// public class main3 {
//     public static void main(String args[]) {
//         System.out.println("Java makes programming fun!");
//     }
// }

//pr1.3
// import java.util.*;
// public class main3 {
//     public static void main(String args[]) {
//         System.out.println("############################ ");
//         System.out.println("#   Java Programming Lab   #Guni@2005$$ ");
//         System.out.println("############################ ");
//     }
// }

//pr1.4
// import java.util.*;
// public class main3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Distance : ");
//         double distance = sc.nextDouble();
//         System.out.println("Enter the Time : ");
//         double time = sc.nextDouble();
//         double speed = distance / time;
//         System.out.println("Speed is : " + speed);

//         System.out.println("Enter P : ");
//         double P = sc.nextDouble();
//         System.out.println("Enter R : ");
//         double R = sc.nextDouble();
//         System.out.println("Enter T : ");
//         double T = sc.nextDouble();
//         double simpleIntrest = (P * R * T) / 100;
//         System.out.println("Simple Intrest is : " + simpleIntrest);

//         System.out.println("Enter r : ");
//         double r = sc.nextDouble();
//         System.out.println("Enter h : ");
//         double h = sc.nextDouble();
//         double volumeofSylinder = 3.14 * r * r * h;
//         System.out.println("Volume of sylinder is : " + volumeofSylinder);
//     }
// }

//pr1.5
//23CS102 Datt "BTech CE" 3
// Aa type ni argument compile pachi run vakhte class nu name lakhine lakhvi.

import java.util.*;

public class main3 {
    public static void main(String[] args) {

        String rollNo = args[0];
        String name = args[1];
        String course = args[2];
        String semester = args[3];

        System.out.println("Single Line Output:");
        System.out.println(
                "Roll Number: " + rollNo + ", Name: " + name + ", Course: " + course + ", Semester: " + semester);

        System.out.println("\nSeparate Line Output:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}