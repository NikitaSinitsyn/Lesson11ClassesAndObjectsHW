public class Book {
    private String name;
    private Author authorName;
    private int publicationDate;

    public Book(String name, Author authorName, int publicationDate) {
        this.name = name;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return this.authorName.getFullName();
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

}
