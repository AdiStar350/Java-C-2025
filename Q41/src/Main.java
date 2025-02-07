public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Jake Paul", "How to be an Idiot", "PP", 2024);

        System.out.println(b2.inBookName("be"));
    }
}
