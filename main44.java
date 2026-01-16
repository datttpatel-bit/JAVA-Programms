//pr5.4
// Write a program to find interest of an amount given by a bank. This
// program code uses function overloading to find interest having two
// different forms. The first form accepts amount and percentage of
// interest and the second form accepts amount and percentage two values
// as parameters additionally with number of year as a parameter.

class BankInterest {

    double interest(double amount, double rate) {
        return (amount * rate * 1) / 100;
    }

    double interest(double amount, double rate, int years) {
        return (amount * rate * years) / 100;
    }
}

public class main44 {
    public static void main(String[] args) {

        BankInterest b = new BankInterest();

        double i1 = b.interest(10000, 5);
        System.out.println("Interest (for 1 year) = " + i1);

        double i2 = b.interest(10000, 5, 3);
        System.out.println("Interest (for 3 years) = " + i2);
    }
}