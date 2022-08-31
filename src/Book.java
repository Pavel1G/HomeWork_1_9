import java.util.Objects;

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

    public Author getAuthor() {
        return author;
    }

    public String getAuthorName() {
        return author.getName() + " " + author.getSurname();
    }

    public int getYearWriting() {
        return yearWriting;
    }

    public void setYearWriting(int yearWriting) {
        this.yearWriting = yearWriting;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.bookName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book initialBook = (Book) obj;
        return this.bookName == initialBook.bookName;
    }

    @Override
    public String toString() {
        return "Автор книги '" + this.bookName + "' - " + this.author.toString() +
                ". Год публикации книги - " + this.yearWriting + ".";
    }
}
