package collections3;
class Book implements Comparable<Book> {
    private String isbn;
    private String author = "";
    private String title = "";
    public Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
    public Book(String isbn) {
        this.isbn = isbn;
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
    public String toString() {
        if(author.equals("") && title.equals("")) {
            return "(ISBN "+isbn+")";
        }
        else {
            return title+" by "+author+" (ISBN "+isbn+")";
        }
    }
    public int compareTo(Book b) {
        return getIsbn().compareTo(b.getIsbn());
    }
    public boolean equals(Object o) {
        if(o.hashCode() == this.hashCode()) {
            return true;
        }
        return false;
    } 
    public int hashCode() {
        return isbn.hashCode();
    }
}