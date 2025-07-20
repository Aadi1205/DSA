package OOPS.Practice;

public class Practice5 {
    public static void main(String[] args) {
        System.out.print(Book.count + " ");
        Book b1 = new Book(150);
        Book b2 = new Book(200);
        // System.out.println(b1.price + " " + b2.price);
        System.out.println(Book.count); //Book.count works because it is static
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}
