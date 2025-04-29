package products;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    private static int bookCount = 0;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setPublication(publication);
        setGenre(genre);
        bookCount++;
    }

    @Override
    protected String generateId() {
        return "1" + String.format("%03d", bookCount);
    }

    @Override
    public String toString() {
        return super.toString() + ", author= " + author + ", publication= " + publication + ", genre= " + genre;
    }

    public String getAuthor() {
        return author;
    }
    public String getPublication() {
        return publication;
    }
    public String getGenre() {
        return genre;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
