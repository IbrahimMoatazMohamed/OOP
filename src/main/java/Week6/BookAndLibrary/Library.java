package Week6.BookAndLibrary;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
    Collection<Book> list = new ArrayList<>();
    public Library(){
    }
    public void addBook(Book newBook) {
        list.add(newBook);
    }
    public void printBooks(){
        for(Book i : list){
            System.out.println(i);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
            ArrayList<Book> found = new ArrayList<Book>();
            for(Book i : this.list){
                if(StringUtils.included(title, i.title())){
                    found.add(i);
                }
            }
            return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book i : this.list){
            if(StringUtils.included(publisher, i.publisher())){
                found.add(i);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book i : this.list){
            if(i.year() == year){
                found.add(i);
            }
        }
        return found;
    }

}
