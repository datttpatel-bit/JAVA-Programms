//pr4.7
// Create a class Book with title, author, and price. Include methods to set details, 
// display details, and apply discount on price. Test it using BookDemo class.

import java.util.*;
class Book {
    String title;
    String author;
    double price;

    void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    void applyDiscount() {
        price = price - (price * 0.10);
        System.out.println("Price after 10% discount: " + price);
    }
}

class main40 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setDetails("Java Programming", "James Gosling", 500);
        System.out.println("Before Discount:");
        b1.displayDetails();

        b1.applyDiscount();

        System.out.println("After Discount:");
        b1.displayDetails();
    }
}