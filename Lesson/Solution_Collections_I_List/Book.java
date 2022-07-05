package collections1;
class Book implements Comparable<Book> {
    private String isbn;
    private String author;
    private String title;
    public Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public Book(String isbn) {
        this.isbn = isbn;
        author = "";
        title = "";
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int compareTo(Book bookToCompare) {
        return getIsbn().compareTo(bookToCompare.getIsbn());
    }
}