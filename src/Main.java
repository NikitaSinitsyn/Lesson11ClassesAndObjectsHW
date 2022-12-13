public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book secondBook = new Book("Think and Grow Rich", "Napoleon Hill", 1936);
        Author firstAuthor = new Author("Francis", "Fitzgerald ");
        Author secondAuthor = new Author("Napoleon", "Hill");
        secondBook.setPublicationDate(1937);
    }
}