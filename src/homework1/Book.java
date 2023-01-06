package homework1;

public class Book {
private String name;
private String genre;
private int dateOfWriting;

    public  Book(String name, String genre, int dateOfWriting) {
        this.name=name;
        this.genre=genre;
        this.dateOfWriting=dateOfWriting;
    }
public String getName(){

        return this.name;
}

    public String getGenre() {
        return this.genre;
    }
public int getDateOfWriting() {
        return this.dateOfWriting;
}

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting=dateOfWriting;
    }
}
