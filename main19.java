// Write a JAVA program to create class Car having data members  Company and Top_Speed.
// Create	member	functions	SetData() and	DisplayData()
// and create two objects of class Car.

// For understanding Example.

import java.util.*;
class car {
    String company;
    float topspeed;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name: ");
        company = sc.nextLine();
        System.out.println("Enter top speed: ");
        topspeed = sc.nextFloat();
    }

    void displayData() {
        System.out.println("Company name is: " + company);
        System.out.println("Top Speed is: " + topspeed);
    }
}

public class main19 {
    public static void main(String args[]) {
        car c1 = new car();
        c1.setData();
        c1.displayData();

        car c2 = new car();
        c2.setData();
        c2.displayData();
    }
}