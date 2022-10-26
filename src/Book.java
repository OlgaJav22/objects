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

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
