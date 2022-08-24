public class Main {
    public static void main(String[] args) {
        Author kirBulyschev = new Author("Kir", "Bulychev");
        Author georgeOrwell = new Author("George", "Orwell");

        Book bookAlice = new Book("Alice: The Girl from Earth", kirBulyschev, 2002);
        Book book1984 = new Book("1984", georgeOrwell, 1949);
//        System.out.println("bookAlice.getYearWriting() = " + bookAlice.getYearWriting());
        bookAlice.setYearWriting(1985);
//        System.out.println("bookAlice.getYearWriting() = " + bookAlice.getYearWriting());

    }
}