//pr5.1
// Create a class named Date having three instance variables named Day,
// Month and Year also has two set_date() to catch values of instance
// variables and get_date() to display caught values on the output screen.
// And create another class DateDemo containing main() method.

import java.util.*;
class Date {
    int day;
    int month;
    int year; 

    void setDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    void getDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}
public class main41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        Date myDate = new Date();
        myDate.setDate(day, month, year);
        myDate.getDate();
    }
}