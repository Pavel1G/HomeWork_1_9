public class Book {
    private String bookName;
    private Author author;
    private int yearWriting;

    public Book(String bookName, Author author, int yearWriting) {
        this.bookName = bookName;
        this.author = author;
        this.yearWriting = yearWriting;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getYearWriting() {
        return yearWriting;
    }

    public void setYearWriting(int yearWriting) {
        this.yearWriting = yearWriting;
    }
}
