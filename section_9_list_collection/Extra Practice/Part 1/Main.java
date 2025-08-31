public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
        Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);

        System.out.println("********************************BOOK STORE*******************************");
        printData(book1);
        printData(book2);
        printData(book3);
        printData(book4);

        book1.setAuthor("Yash Shah");
        book1.setRating(4.9);
        book1.setPrice(8.99);
        book1.setTitle("Test Biography");

        System.out.println("********************************BOOK STORE UPDATED*******************************");
        printData(book1);

        Book copyBook1 = new Book(book1);
        Book copyBook2 = new Book(book3);

        copyBook1.setAuthor("Yash Shah");
        copyBook1.setRating(4.9);
        copyBook1.setPrice(8.99);
        copyBook1.setTitle("Test Biography");

        copyBook2.setAuthor("Charmi Shah");
        copyBook2.setRating(4.9);
        copyBook2.setPrice(8.99);
        copyBook2.setTitle("Test Biography 2");

        System.out.println("********************************BOOK STORE COPIED*******************************");
        printData(copyBook1);
        printData(book3);
        printData(copyBook2);

    }

    public static void printData(Book book) {
        System.out
                .println(book.getRating() + "\t" + book.getPrice() + "\t\t" + book.getAuthor() + "\t\t"
                        + book.getTitle());
    }
}