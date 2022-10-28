import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Book story = new Book("Снежная королева", new Author("Андерсен", "Ханс Кристиан"), 2000);

        Book lyrics = new Book("Поиграем!Стихи", new Author("Токмакова", "Ирина"), 1995);

        System.out.println(story);
        System.out.println(lyrics);
        System.out.println(story.equals(lyrics));
        System.out.println(story.hashCode());
        System.out.println(lyrics.hashCode());

    }
}