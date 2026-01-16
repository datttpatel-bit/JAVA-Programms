//pr4.3
// Create a class Employee with empId, empName, and salary. Include a method 
// to display details and another to calculate bonus (10% of salary). Test it using 
// EmployeeDemo with the main() method. 

import java.util.*;
class Employee {
    int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("\nEmployee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}

public class main36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal1 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, sal1);

        e1.displayDetails();
        System.out.println("Bonus: " + e1.calculateBonus());

    }
}