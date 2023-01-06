package homework1;

public class Book {
private String name;
private int dateOfWriting;

    public  Book(String name, int dateOfWriting) {
        this.name=name;
        this.dateOfWriting=dateOfWriting;
    }
public String getName(){

        return this.name;
}
public int getDateOfWriting() {
        return this.dateOfWriting;
}

    public void setDateOfWriting(int dateOfWriting) {
        this.dateOfWriting=dateOfWriting;
    }
}
