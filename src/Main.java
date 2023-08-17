public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1869);
        Book idiot = new Book("Идиот", dostoevsky, 1869);
    }
}