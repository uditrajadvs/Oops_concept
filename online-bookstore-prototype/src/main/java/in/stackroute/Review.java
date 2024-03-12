package in.stackroute;

public class Review {
    private Customer reviewer;
    private Book book;
    private String reviewText;

    public Review(Customer reviewer, Book book, String reviewText) {
        this.reviewer = reviewer;
        this.book = book;
        this.reviewText = reviewText;
    }
}
