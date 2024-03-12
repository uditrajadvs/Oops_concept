package in.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum BookStore {
    INSTANCE; // Singleton instance

    private List<Book> availableBooks;
    private Map<String, Customer> customers;

    BookStore() {
        availableBooks = new ArrayList<>();
        customers = new HashMap<>();
    }

    // Method to add a book to the store's available books
    public void addBook(Book book) {
        availableBooks.add(book);
    }

    // Method to register a new customer
    public void registerCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    // Method to get a customer by ID
    public Customer getCustomerById(String customerId) {
        return customers.get(customerId);
    }

    // Other methods for managing books, customers, etc.
}

