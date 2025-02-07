public class Book {
    private String writerName;
    private String bookName;
    private String publisher;
    private int publishYear;

    public Book() {
        this.writerName = "John Doe";
        this.bookName = "None";
        this.publisher = "None";
        this.publishYear = -1;
    }

    public Book(String writerName, String bookName, String publisher, int publishYear) {
        this.writerName = writerName;
        this.bookName = bookName;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    public String getWriterName() {
        return this.writerName;
    }

    public void setWriterName(String writerName) {
        if (!writerName.matches("^[a-zA-Z]$")) {
            System.out.println("Writer name must be only letters.");
            return;
        }

        System.out.format("Writer name updated: %s\n", writerName);
        this.writerName = writerName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean inBookName(String s) {
        return this.bookName.contains(s);
    }
}
