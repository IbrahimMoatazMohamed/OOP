package Week7.Library;

import java.util.ArrayList;
import java.util.Optional;

public class LibraryCatalog {
    ArrayList<Book> list;
    public LibraryCatalog(){
        list = new ArrayList<>();
    }
    public void addBook(Book b){
        list.add(b);
    }
    public boolean check(String title){
        return list.stream()
                .filter(book -> book.title().equals(title))
                .findAny()
                .map(Book::availability)
                .orElse(false);
    }
    public String retrieve(String author) {
        Optional<Book> i = list.stream()
                        .filter(book -> book.author().equals(author))
                        .findFirst();
        return i.map(Book::toString).orElse("DNE");
    }
    public void updateStatus(Book upd){
        boolean theNew = !upd.availability();
        list.stream()
                .filter(book -> book.equals(upd))
                .findFirst()
                .ifPresent(book -> {
                    int index = list.indexOf(book);
                    if (index != -1) {
                        list.set(index, new Book(book.title(), book.author(), book.publicationYear(), theNew));
                    }
                });
    }
    public void displayCatalog(){
        list.stream()
                .forEach(book -> System.out.println(book));
    }
}
