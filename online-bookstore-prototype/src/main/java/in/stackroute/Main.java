package in.stackroute;

public class Main {
    public static void main(String[] args) {
        // Create instances of Book, Customer, and demonstrate functionalities

        // Example usage:
        Book book1 = new Book("Book Title", "Author Name", "Fiction", 29.99f, 300, "ISBN123");
        Customer customer1 = new Customer("CUST123", "John Doe", "123 Main St", "john@example.com", "123-456-7890");
        BookStore.INSTANCE.registerCustomer(customer1);

        // Purchase a book and leave a review
        customer1.purchaseBook(book1);
        customer1.leaveReview(book1, "This book was fantastic!");
        customer1.rateBook(book1, 4.5);

        // Request a book
        customer1.requestBook("New Book Request", "New Author", "Mystery");
        System.out.println("Hello world!");
    }
}