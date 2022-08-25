import java.util.HashSet;
import java.util.Set;

public class BookMain {
    public static Set<Book> books = new HashSet<>();

    static {
        books.add(new Book("001","100100","DUDUDU","SpongeBob","1988/1/2"));
        books.add(new Book("002","100101","HAHAH","Xiyangyang","1999/2/2"));
    }

    public Set<Book> getBooks(){
        return books;
    }
}
