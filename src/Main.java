public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Достоевский ", "Федор");
        Book player = new Book("Игрок", author1, "Ужасы", 1866);
        System.out.println(player);

        player.setYear(2002);
        System.out.println(player);


        Author author2 = new Author("Достоевский ", "Федор");
        Book book2 = new Book("Преступление и наказание", author2, "Роман", 1866);
        System.out.println(book2);

        Author author3 = new Author("Достоевский ", "Федор");

        Book book3 = new Book("Идиот", author3, "Роман", 1867);

        System.out.println(book3);
        System.out.println(author3.equals(author2));
        System.out.println(book2.equals(book3));

    }
}
