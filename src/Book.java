public class Book {
     private String nameBook;
    private int ageBook;
    public  Book (String nameBook, int ageBook) {
        this.nameBook = nameBook;
        this.ageBook = ageBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getAgeBook() {
        return this.ageBook;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
