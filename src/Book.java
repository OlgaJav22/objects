import java.util.Objects;

public class Book {
     private String nameBook;
    private int ageBook;
    private Author author;
    public  Book (String nameBook, Author author, int ageBook) {
        this.nameBook = nameBook;
        this.ageBook = ageBook;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getAgeBook() {
        return this.ageBook;
    }
    public Author getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ageBook == book.ageBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, ageBook, author);
    }

    @Override
    public String toString() {
        return "Название книги: " + this.nameBook + "; год выпуска: " + this.ageBook + "г. " + author;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
