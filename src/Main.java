public class Main {
    public static void main(String[] args) {

        Author story1 = new Author("Андерсен", "Ханс Кристиан");
        Book story = new Book("Снежная королева", story1,2000);

        System.out.println("Название книни; автор и год выпуска: " + story.getNameBook() + "; " + story1.getFirstNameAuthor() + " " + story1.getLastNameAuthor() + "; " + story.getAgeBook());
        story.setAgeBook(2002);
        System.out.println("Новая дата выпуска = " + story.getAgeBook());

        Author lyrics = new Author("Токмакова", "Ирина");
        Book lyrics1 = new Book("Поиграем!Стихи", lyrics, 1995);

        System.out.println("Название книги; автор и год выпуска: " + lyrics1.getNameBook() + "; " + lyrics.getFirstNameAuthor() + "; " + lyrics.getLastNameAuthor() + " " +lyrics1.getAgeBook());

    }
}