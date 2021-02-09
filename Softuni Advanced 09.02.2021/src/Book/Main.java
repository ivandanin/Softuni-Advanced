package Book;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Book one = new Book("Animal Farm", 2003, "George Orwell");
        Book two = new Book("The Documents in the Case", 2002);
        Book three = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustance");

        List<Book> books = new ArrayList<>();
        books.add(one);
        books.add(two);
        books.add(three);
    }
}
