//pr5.3
// Create a class Exam having stu_name, rollno, sub_code, sub_name,
// InternalMarks and ExternalMarks also contains two methods
// Calculate_result() and Show_result(). Students having marks to be
// shown in ouput with his name and roll_no. A main() method is
// contained by Exam_demo class. Use parameterized constructor with
// local variable named as instance variables which hides them. Note: Use
// your additional variables as per your needs.

import java.util.*;
class exam {
    String stu_name;
    int rollno;
    int sub_code;
    String sub_name;
    int internalmarks;
    int externalmarks;
    int totalmarks;

    public exam(String stu_name, int rollno, int sub_code, String sub_name,
                int internalmarks, int externalmarks) {
        this.stu_name = stu_name;
        this.rollno = rollno;
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.internalmarks = internalmarks;
        this.externalmarks = externalmarks;
    }
    public void calculate_result() {
        totalmarks = internalmarks + externalmarks;
        if (totalmarks > 40) {
            System.out.println("Passed in exam.");
        } else {
            System.out.println("Fail in exam.");
        }
    }
    public void show_result() {
        System.out.println("Student name is : " + stu_name);
        System.out.println("Student rollno is : " + rollno);
        System.out.println("subject code is : " + sub_code);
        System.out.println("subject name is : " + sub_name);
        System.out.println("Internal marks is : " + internalmarks);
        System.out.println("External marks is : " + externalmarks);
        System.out.println("Total marks is : " + totalmarks);
    }
}
public class main43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String stuname = sc.nextLine();
        System.out.println("Enter rollno: ");
        int rollno = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter sub code: ");
        int subcode = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter sub name: ");
        String subname = sc.nextLine();
        System.out.println("Enter internal marks: ");
        int internalmarks = sc.nextInt();

        System.out.println("Enter external marks: ");
        int externalmarks = sc.nextInt();

        exam e1 = new exam(stuname, rollno, subcode, subname, internalmarks, externalmarks);

        e1.calculate_result();
        e1.show_result();

        sc.close();
    }
}
