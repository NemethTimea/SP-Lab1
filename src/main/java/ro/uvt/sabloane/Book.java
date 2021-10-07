package ro.uvt.sabloane;

import java.util.Collection;
import java.util.LinkedList;

public class Book {

    private final String title;
    private final Collection<Author> autori = new LinkedList<>();

    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author autor){
        autori.add(autor);
    }

    public void removeAuthor(Author autor){
        autori.remove(autor);
    }

    public Collection<Author> getAuthors(){
        return autori;
    }
}
