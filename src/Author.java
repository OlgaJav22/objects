public class Author {
    private String lastNameAuthor;
    private String firstNameAuthor;

    public Author (String lastNameAuthor, String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }
    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }
    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }
}
