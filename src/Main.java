import homework1.Author;
import homework1.Book;

public class Main {


    public static void main(String[] args) {

        Book crimesAndPunishments = new Book("Достоевский", 1865);
        System.out.println("crimesAndPunishments.name = " + crimesAndPunishments.getName());
        System.out.println("crimesAndPunishments.dateOfWriting = " + crimesAndPunishments.getDateOfWriting());
        crimesAndPunishments.setDateOfWriting(1800);
        System.out.println("crimesAndPunishments.getDateOfWriting() = " + crimesAndPunishments.getDateOfWriting());



        Author name = new Author("достоевский", "Fedor");
        System.out.println("name.firstName = "+name.getFirstName());
        System.out.println("name.secondName = "+name.getSecondName());


    }
}