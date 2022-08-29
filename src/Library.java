import java.lang.reflect.Array;

public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBookToLibrary(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void printBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthorName() + ": " + books[i].getBookName() + ": " +
                        books[i].getYearWriting());
            }
        }
    }

    private int findByName(String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void removeByName(String name) {
        int index = findByName(name);
        // Удаляем книгу из массива.
    }

    public void printInfoByName(String name) {
        var index = findByName(name);
        var book = books[index];

        System.out.printf("%s was published in %d", book.getBookName(), book.getYearWriting() );
    }
}

