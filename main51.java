// pr 5.9 change
//Write a program to implement following scenario. 
//      interface A      interface B
//                   |
//                   |
//               interface C
//                   |
//                   |
//                 Class E --------- Class D 

interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class D {
    void methodD() {
        System.out.println("This is Method D from Class D");
    }
}

class E extends D implements C {
    public void methodA() {
        System.out.println("This is Method A from Interface A");
    }

    public void methodB() {
        System.out.println("This is Method B from Interface B");
    }

    public void methodC() {
        System.out.println("This is Method C from Interface C");
    }
}

public class main51 {
    public static void main(String[] args) {
        E obj = new E();

        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}