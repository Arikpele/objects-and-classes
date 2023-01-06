import homework1.Author;
import homework1.Book;

public class Main {


    public static void main(String[] args) {

        Book crimesAndPunishments = new Book("Достоевский", 1865);
        System.out.println("crimesAndPunishments.name = " + crimesAndPunishments.name);
        System.out.println("crimesAndPunishments.dateOfWriting = " + crimesAndPunishments.dateOfWriting);



        Author name = new Author("достоевский", "Fedor");
        System.out.println("name.firstName = "+name.firstName);
        System.out.println("name.secondName = "+name.secondName);


    }
}