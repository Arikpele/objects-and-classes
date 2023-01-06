import homework1.Author;
import homework1.Book;
import homework1.Interval;

public class Main {


    public static void main(String[] args) {
        Interval Strok=new Interval("---------------------------------------------------");
        System.out.println(Strok.beginningText);
        Book player = new Book("Игрок","Роман", 1866);
        System.out.println("player.name = " + player.getName());
        System.out.println("player.getGenre() = " + player.getGenre());
        System.out.println("player.dateOfWriting = " + player.getDateOfWriting());

        Author name = new Author("Достоевский", "Федор");
        System.out.println("name.firstName = "+name.getFirstName());
        System.out.println("name.secondName = "+name.getSecondName());
        System.out.println(Strok.beginningText);

        player.setDateOfWriting(1800);
        System.out.println("player.getDateOfWriting() = " + player.getDateOfWriting());
        System.out.println(Strok.beginningText);


        Book Demons = new Book("Бесы", "Ужасы)))", 1872);
        Author Book = new Author("Федор", "Достоевский");
        System.out.println("Названия книги "+"="+" " + Demons.getName());
        System.out.println("Жанр"+" "+"книги"+ " = " + Demons.getGenre());
        System.out.println("Дата публикации = " + Demons.getDateOfWriting());
        System.out.println("Имя автора = " + Book.getFirstName());
        System.out.println("Фамилия автора =  " + Book.getSecondName());
        System.out.println(Strok.beginningText);

    }
}