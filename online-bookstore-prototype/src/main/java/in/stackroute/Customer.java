package in.stackroute;



import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhoneNumber;
    private List<Book> purchasedBooks;
    private List<BookRequest> bookRequests;

    public Customer(String customerId, String customerName, String customerAddress, String customerEmail, String customerPhoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.purchasedBooks = new ArrayList<>();
        this.bookRequests = new ArrayList<>();
    }

    // Getters and setters for attributes

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public List<BookRequest> getBookRequests() {
        return bookRequests;
    }

    // Method to purchase a book

    public void purchaseBook(Book book) {
        purchasedBooks.add(book);
    }


    // Method to leave a review for a purchased book

    public void leaveReview(Book book, String reviewText) {
        Review review = new Review(this, book, reviewText);
        book.addReview(review);
    }

    // Method to rate a purchased book

    public void rateBook(Book book, double rating) {
        book.addRating(rating);
    }

    // Method to request a book

    public void requestBook(String title, String author, String genre) {
        BookRequest request = new BookRequest(title, author, genre);
        bookRequests.add(request);
    }
}

