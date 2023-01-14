public class Book {
    /* private String nameBook;
     private Author author;
     private int year;*/
    private String name;
    private Author author;
    private String genre;
    private int dateOfWriting;

    public Book(String name, Author author, String genre, int dateOfWriting) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.dateOfWriting = dateOfWriting;
    }

    public void setYear(int dateOfWriting) {

        this.dateOfWriting = dateOfWriting;
    }


    public String toString() {
        return "Название книги: " + name + ", год выпуска: " + dateOfWriting + ", Автор: " + author + ",| Жанр-" + genre;
    }


    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Book that = (Book) o;
        return name.equals(that.name);
    }


    public int hashCode() {

        return java.util.Objects.hash(name);
    }
}