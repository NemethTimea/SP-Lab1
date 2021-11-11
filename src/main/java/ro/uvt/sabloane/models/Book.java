package ro.uvt.sabloane.models;

import java.util.*;

public class Book extends Section implements Visitee{
//    private final String title;
    private final Collection<Author> autori = new LinkedList<>();

    public Book(String title){
        super(title);
    }

    public void addAuthor(Author autor){
        autori.add(autor);
    }

    public void removeAuthor(Author autor){
        autori.remove(autor);
    }

    public String getTitle(){
        return title;
    }

    public Collection<Author> getAuthors(){
        return Collections.unmodifiableCollection(autori);
    }

    public void add(Section playboyS1) {
        elements.add(playboyS1);
    }

    public void accept(Visitor visitor){
        visitor.visitBook(this);
    }
}