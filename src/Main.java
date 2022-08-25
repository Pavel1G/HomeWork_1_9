public class Main {
    public static void main(String[] args) {
        Author kirBulyschev = new Author("Kir", "Bulychev");
        Author georgeOrwell = new Author("George", "Orwell");

        Book bookAlice = new Book("Alice: The Girl from Earth", kirBulyschev, 2002);
        Book bookVillage = new Book("Village", kirBulyschev, 1978);
        Book book1984 = new Book("1984", georgeOrwell, 1949);
        Book bookAnimalFarm = new Book("Animal Farm", georgeOrwell, 1945);

        bookAlice.setYearWriting(1985);

        Book[] arrBooks = new Book[5];

        addBook(arrBooks, bookAlice);
        addBook(arrBooks, bookVillage);
        addBook(arrBooks, book1984);
        addBook(arrBooks, bookAnimalFarm);

        printBook(arrBooks);
    }

    public static Book[] addBook(Book[] arrBooks, Book book) {
        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] == null) {
                arrBooks[i] = book;
                break;
            }
        }
        return arrBooks;
    }

    public static void printBook(Book[] arrBooks) {
        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] != null) {
                System.out.println(arrBooks[i].getAuthorName() + ": " + arrBooks[i].getBookName() + ": " +
                        arrBooks[i].getYearWriting());
            }
        }
    }
}