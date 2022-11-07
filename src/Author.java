import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastNameAuthor, author.lastNameAuthor) && Objects.equals(firstNameAuthor, author.firstNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastNameAuthor, firstNameAuthor);
    }

    @Override
    public String toString() {
        return "Автор: " + this.firstNameAuthor + " " + this.lastNameAuthor + ".";
    }
}
