public class Main {
    public static void main(String[] args) {
        Author kirBulyschev = new Author("Kir", "Bulychev");
        Author georgeOrwell = new Author("George", "Orwell");

        Book bookAlice = new Book("Alice: The Girl from Earth", kirBulyschev, 2002);
        Book bookVillage = new Book("Village", kirBulyschev, 1978);
        Book book1984 = new Book("1984", georgeOrwell, 1949);
        Book bookAnimalFarm = new Book("Animal Farm", georgeOrwell, 1945);

        bookAlice.setYearWriting(1985);

        var lib = new Library(5);
        lib.addBookToLibrary(bookAlice);
        lib.addBookToLibrary(bookVillage);
        lib.addBookToLibrary(book1984);
        lib.addBookToLibrary(bookAnimalFarm);

//        lib.printBook();
        lib.printInfoByName("Village");
    }




}