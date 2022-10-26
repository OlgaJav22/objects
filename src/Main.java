public class Main {
    public static void main(String[] args) {

        Book story = new Book("Снежная королева", 2000);
        Author story1 = new Author("Андерсен", "Ханс Кристиан");
        System.out.println("Название книни; автор и год выпуска: " + story.getNameBook() + "; " + story1.getFirstNameAuthor() + " " + story1.getLastNameAuthor() + "; " + story.getAgeBook());
        story.setAgeBook(2002);
        System.out.println("Новая дата выпуска = " + story.getAgeBook());
    }
}