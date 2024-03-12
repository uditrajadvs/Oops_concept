package in.stackroute;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String genre;
    private float price;
    private int totalPage;
    private String bookISBN;
    private List<Review> reviews;
    private double averageRating;

    public Book(String title, String author, String genre, float price, int totalPage, String bookISBN) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookISBN = bookISBN;
        this.price = price;
        this.totalPage = totalPage;
        this.reviews = new ArrayList<>();
        this.averageRating = 0;
    }

    // Other methods

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void addRating(double rating) {
        // You can implement logic to update averageRating based on the new rating and the existing ratings
        double totalRating = averageRating * reviews.size();
        totalRating += rating;
        averageRating = totalRating / (reviews.size() + 1);
    }

    // Getters for attributes

    public double getAverageRating() {
        return averageRating;
    }
}

