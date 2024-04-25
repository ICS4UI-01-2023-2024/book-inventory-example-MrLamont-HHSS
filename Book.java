public class Book {
    private long isbn;
    private String title;
    private String author;
    private double rating;

    public Book(long isbn, String title, String author, double rating) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public long getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        return rating;
    }
}
