import homework1.Author;
import homework1.Book;
import homework1.Interval;

public class Main {


    public static void main(String[] args) {
        Interval Strok = new Interval("---------------------------------------------------");
        System.out.println(Strok.beginningText);
        Author author1 = new Author("Достоевский", "Федор");
        Book player = new Book("Игрок", "Роман", author1, 1866);
        System.out.println("player.name = " + player.getName());
        System.out.println("player.Author =" + player.getAuthor());
        System.out.println("player.getGenre() = " + player.getGenre());
        System.out.println("player.dateOfWriting = " + player.getDateOfWriting());


        System.out.println("name.firstName = " + author1.getFirstName());
        System.out.println("name.secondName = " + author1.getSecondName());
        System.out.println(Strok.beginningText);

        player.setDateOfWriting(1800);
        System.out.println("player.getDateOfWriting() = " + player.getDateOfWriting());
        System.out.println(Strok.beginningText);


        Author author2 = new Author("Федор", "Достоевский");
        Book Demons = new Book("Бесы", "Ужасы)))", author2, 1866);
        System.out.println("Названия книги " + "=" + " " + Demons.getName());
        System.out.println("Жанр" + " " + "книги" + " = " + Demons.getGenre());
        System.out.println("Дата публикации = " + Demons.getDateOfWriting());
        System.out.println("Имя автора = " + author2.getFirstName());
        System.out.println("Фамилия автора =  " + author2.getSecondName());
        System.out.println(Strok.beginningText);

    }
}