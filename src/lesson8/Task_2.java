package lesson8;

public class Task_2 {
    public static void main(String[] args) {
        Library library = new Library("zhandos", "Almaty");

        Book a1 = new Book(0, "olzhas", "zhandos");
        Book a2 = new Book(1, "olzhas", "zhandos");
        Book a3 = new Book(2, "olzhas", "zhandos");
        Book a4 = null;
        Book a5 = new Book(4, "olzhas", "zhandos");
        Book a6 = new Book(5, "olzhas", "zhandos");

        Book books[] = {a1, a2, a3, a4, a5, a6};

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }

        library.printBooks();
    }
}
