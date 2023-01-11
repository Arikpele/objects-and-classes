package homework1;

public class Book {
    private String name;
    private String Author;
    private String genre;
    private int dateOfWriting;

    public Book(String name, String genre, String Author, int dateOfWriting) {
        this.name = name;
        this.Author = Author;
        this.genre = genre;
        this.dateOfWriting = dateOfWriting;
    }

    public String getName() {

        return this.name;
    }

    public String getGenre() {

        return this.genre;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getDateOfWriting() {

        return this.dateOfWriting;
    }

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }
}
