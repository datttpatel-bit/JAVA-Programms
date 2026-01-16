//pr4.1
//  Create a Java class named Student that stores student name, ID, and course. 
// Include methods to set details, display details, and create another class 
// StudentDemo with the main() method to test it. 

import java.util.*;
class Student {
    String name;
    String studentId;
    String course;

    void setDetails(String name, String studentId, String course) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
public class main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter studentId: ");
        String studentId = sc.nextLine();
        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        Student s1 = new Student();  
        s1.setDetails(name, studentId, course); 
        s1.displayDetails(); 
    }
}