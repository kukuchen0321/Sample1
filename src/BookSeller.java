public class BookSeller {

    public static class Book {
        public String id;
        public String isbn;
        public String name;
        public String author;
        public String public_date;

        public Book(String id, String isbn, String name, String author, String public_date) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.public_date = public_date;
        }
    }

    public static void sellBooks(String id, String isbn, String name, String author, String public_date) {
        BookSeller.Book b1 = new BookSeller.Book(id,isbn,name,author,public_date);
        System.out.println(b1.name+" "+b1.author+ " "+b1.public_date);

    }

    public static void main(String[] args) {
        BookSeller.sellBooks("001","100100","DUDUDU","SpongeBob","1988/1/2");
    }

}
