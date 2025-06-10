class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    Book(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    { //Object init
        totalBooks++;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    void boorwBook() {
        if (isBorrowed) System.out.println("Already Borrowed");
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book " + this.title);
        }
    }

    void returnBook()
    {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed this book");
        }
        else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design","Auhtor");
        Book myBook = new Book("2" );
        System.out.println(Book.getTotalBooks());
        designOfThings.boorwBook();
        myBook.boorwBook();
        designOfThings.boorwBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
