// // Simple inheritance
// class student {
//     int roll, marks;
//     String name;

//     void setdata() {
//         System.out.println("Roll,name and marks is : ");
//     }
// }

// public class main52 extends student {
//     void getdata() {
//         roll = 75;
//         name = "Datt";
//         marks = 100;
//         System.out.println(roll + " " + name + " " + marks);
//     }

//     public static void main(String[] args) {
//         main52 m = new main52();
//         m.setdata();
//         m.getdata();
//     }
// }

// // Multi-level inheritance
// class A {
//     int a, b, c;

//     void add() {
//         a = 10;
//         b = 20;
//         c = a + b;
//         System.out.println("Sum is: " + c);
//     }

//     void sub() {
//         a = 30;
//         b = 20;
//         c = a - b;
//         System.out.println("Sub is: " + c);
//     }
// }

// class B extends A {
//     void mult() {
//         a = 10;
//         b = 20;
//         c = a * b;
//         System.out.println("multi is: " + c);
//     }

//     void div() {
//         a = 30;
//         b = 10;
//         c = a / b;
//         System.out.println("div is: " + c);
//     }
// }

// class C extends B {
//     void rem() {
//         a = 10;
//         b = 3;
//         c = a % b;
//         System.out.println("rem is: " + c);
//     }
// }

// public class main52 {
//     public static void main(String[] args) {
//         C m = new C();
//         m.add();
//         m.sub();
//         m.mult();
//         m.div();
//         m.rem();
//     }
// }

// Hierarchical inheritance 
class A {
    void setdata() {
        System.out.println("Your name is : ");
    }
}

class B extends A {
    void getdata() {
        System.out.println("Dattt");
    }
}

class C extends A {
    void display() {
        System.out.println("Dattt Patel");
    }
}

public class main52 {
    public static void main(String[] args) {
        B r = new B();
        C r2 = new C();

        r.setdata();
        r.getdata();

        r2.setdata();
        r2.display();
    }
}