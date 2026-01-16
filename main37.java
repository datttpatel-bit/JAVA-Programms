//pr4.4
// Write a program using constructor overloading to initialize an object with no
// arguments, one argument (name), and two arguments (name and age). Display
// details for each case.

import java.util.*;
class Person {
    String name;
    int age;
    Person() {
        name = "Unknown";
        age = 0;
    }
    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class main37 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("Bob", 25);
        p1.display();
        p2.display();
        p3.display();
    }
}