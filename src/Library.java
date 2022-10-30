public class Library {
    private final Book [] books;
    public Library (int size) {books = new Book[size];}

    public void addBook (Book book) {
        int freePosition = findEmptyPosition();
        if (freePosition == -1) {
            System.out.println("Хранилище заполнено");
            return;
        }
        books[freePosition] = book;
    }
    public  int findEmptyPosition () {
        for (int i =0; i< books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
