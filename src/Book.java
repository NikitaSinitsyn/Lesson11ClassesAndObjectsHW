public class Book {
    private String name;
    private String authorName;
    private int publicationDate;

    public Book(String name, String authorName, int publicationDate) {
        this.name = name;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

}
