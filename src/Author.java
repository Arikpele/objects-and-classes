public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public String toString() {
        return firstName + secondName;
    }


    public boolean equals(Object author) {
        if (author == null || this.getClass() != author.getClass())
            return false;
        Author that = (Author) author;
        return firstName.equals(that.firstName) &&
                secondName.equals(that.secondName);
    }


    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }
}

