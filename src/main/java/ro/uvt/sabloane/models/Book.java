package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.*;

@Entity
public class Book extends Section implements Visitee{

    @ManyToMany
    private final Collection<Author> autori = new LinkedList<>();

    public Book(String title){
        super(title);
    }

    public void addAuthor(Author aAutor){
        autori.add(aAutor);
    }

    public Collection<Author> getAuthors(){
        return Collections.unmodifiableCollection(autori);
    }

    public void add(Section playboyS1) {
        elements.add(playboyS1);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitBook(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitBook(this);
    }
}