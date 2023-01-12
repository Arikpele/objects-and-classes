package homework1;

public class Book {
    private String name;
    private Author author;
    private String genre;
    private int dateOfWriting;

    public Book(String name, String genre, Author author, int dateOfWriting) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.dateOfWriting = dateOfWriting;
    }

    public String getName() {

        return this.name;
    }

    public String getGenre() {

        return this.genre;
    }

    public Author getAuthor() {

        return this.author;
    }

    public int getDateOfWriting() {

        return this.dateOfWriting;
    }

    public void setDateOfWriting(int dateOfWriting) {

        this.dateOfWriting = dateOfWriting;
    }
}
